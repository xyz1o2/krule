package com.ph.mapper;

import com.ph.entity.BaseEntity;
import com.ph.tool.StringTool;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.builder.annotation.ProviderContext;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.StringJoiner;

/**
 * Author:  Hardy
 * Date:    2018/7/18 20:05
 * Description: 数据库操作公共方法基类
 **/
public interface BaseMapper<T extends BaseEntity> {

    @InsertProvider(type = GenSqlProvider.class, method = "insert")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(T t);

    @UpdateProvider(type = GenSqlProvider.class, method = "update")
    void update(T t);

    @SelectProvider(type = GenSqlProvider.class, method = "findOne")
    T findOne(long id);

    @SelectProvider(type = GenSqlProvider.class, method = "findOneForUpdate")
    T findOneForUpdate(long id);

    class GenSqlProvider {

        public String insert(Object o) {
            StringJoiner fldSj = new StringJoiner(",", "(", ")");
            StringJoiner valSj = new StringJoiner(",", "(", ")");

            Field[] supFields = o.getClass().getSuperclass().getDeclaredFields();
            for (Field field : supFields) {
                field.setAccessible(true);
                fldSj.add("`" + StringTool.camelToUnderline(field.getName()) + "`");
                valSj.add("#{" + field.getName() + "}");
            }
            Field[] fields = o.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                fldSj.add("`" + StringTool.camelToUnderline(field.getName()) + "`");
                valSj.add("#{" + field.getName() + "}");
            }

            StringBuilder sb = new StringBuilder();
            sb.append("insert into ").append(StringTool.camelToUnderline(o.getClass().getSimpleName()));
            sb.append(fldSj.toString());
            sb.append(" values ");
            sb.append(valSj.toString());
            return sb.toString();
        }

        public String update(Object o) {
            StringJoiner fldSj = new StringJoiner(",");

            Field[] supFields = o.getClass().getSuperclass().getDeclaredFields();
            for (Field field : supFields) {
                if ("id".equals(field.getName())) continue;
                fldSj.add("`" + StringTool.camelToUnderline(field.getName()) + "`" + "=" + "#{" + field.getName() + "}");
            }
            Field[] fields = o.getClass().getDeclaredFields();
            for (Field field : fields) {
                fldSj.add("`" + StringTool.camelToUnderline(field.getName()) + "`" + "=" + "#{" + field.getName() + "}");
            }

            StringBuilder sb = new StringBuilder();
            sb.append("update ").append(StringTool.camelToUnderline(o.getClass().getSimpleName())).append(" set ");
            sb.append(fldSj.toString());
            sb.append(" where id = #{id}");

            return sb.toString();
        }

        public String findOne(ProviderContext cxt) {
            String name = getInterfaceGeneric(cxt.getMapperType());
            return "select * from " +
                    StringTool.camelToUnderline(name) +
                    " where id = #{id}";
        }

        public String findOneForUpdate(ProviderContext cxt) {
            String name = getInterfaceGeneric(cxt.getMapperType());
            return "select * from " +
                    StringTool.camelToUnderline(name) +
                    " where id = #{id} for update";
        }

        private String getInterfaceGeneric(Class cls) {
            if (cls == null)
                return null;

            // 获取继承的接口
            Type[] tyes = cls.getGenericInterfaces();
            if (tyes.length == 0)
                return null;

            ParameterizedType type = (ParameterizedType) tyes[0];

            // 获取继承的接口的泛型
            Type[] genTypes = type.getActualTypeArguments();
            if (genTypes.length - 1 < 0)
                return null;
            Class genCls = (Class) genTypes[0];

            return genCls.getSimpleName();
        }
    }
}