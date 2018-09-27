package com.ph.tool;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang.StringEscapeUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;

/**
 * 各种格式的编码加码工具类.
 * 
 */
public class EncodeUtils
{

	private static final String DEFAULT_URL_ENCODING = "UTF-8";

	/**
	 * Hex编码.
	 */
	public static String hexEncode(byte[] input)
	{
		return Hex.encodeHexString(input);
	}

	/**
	 * Hex解码.
	 */
	public static byte[] hexDecode(String input)
	{
		try
		{
			return Hex.decodeHex(input.toCharArray());
		}
		catch (DecoderException e)
		{
			throw new IllegalStateException("Hex Decoder exception", e);
		}
	}

	/**
	 * Base64编码.
	 */
	public static String base64Encode(byte[] input)
	{
		return Base64.encodeBase64String(input);
	}

	/**
	 * Base64编码, URL安全(对URL不支持的字符如+,/,=转为其他字符, 见RFC3548).
	 */
	public static String base64UrlEncode(byte[] input)
	{
		return Base64.encodeBase64URLSafeString(input);
	}

	/**
	 * Base64解码.
	 */
	public static byte[] base64Decode(String input)
	{
		return Base64.decodeBase64(input);
	}

	/**
	 * URL 编码, Encode默认为UTF-8. 
	 */
	public static String urlEncode(String input)
	{
		return urlEncode(input, DEFAULT_URL_ENCODING);
	}

	/**
	 * URL 编码.
	 */
	public static String urlEncode(String input, String encoding)
	{
		try
		{
			return URLEncoder.encode(input, encoding);
		}
		catch (UnsupportedEncodingException e)
		{
			throw new IllegalArgumentException("Unsupported Encoding Exception", e);
		}
	}

	/**
	 * URL 解码, Encode默认为UTF-8. 
	 */
	public static String urlDecode(String input)
	{
		return urlDecode(input, DEFAULT_URL_ENCODING);
	}

	/**
	 * URL 解码.
	 */
	public static String urlDecode(String input, String encoding)
	{
		try
		{
			return URLDecoder.decode(input, encoding);
		}
		catch (UnsupportedEncodingException e)
		{
			throw new IllegalArgumentException("Unsupported Encoding Exception", e);
		}
	}

	/**
	 * Html转码.
	 */
	public static String htmlEscape(String html)
	{
		return StringEscapeUtils.escapeHtml(html);
	}

	/**
	 * Html 反转码.
	 */
	public static String htmlUnescape(String htmlEscaped)
	{
		return StringEscapeUtils.unescapeHtml(htmlEscaped);
	}

	/**
	 * Xml转码.
	 */
	public static String xmlEscape(String xml)
	{
		return StringEscapeUtils.escapeXml(xml);
	}

	/**
	 * Xml 反转码.
	 */
	public static String xtmlUnescape(String xmlEscaped)
	{
		return StringEscapeUtils.unescapeXml(xmlEscaped);
	}
	
	public static String base64Encode(String s) throws Exception{
		if (s == null)
			return null;
		return (new BASE64Encoder()).encode(s.getBytes("UTF-8"));
	}

	public static String base64DecodeToString(String s) {
		if (s == null)
			return null;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			byte[] b = decoder.decodeBuffer(s);
			return new String(b,"UTF-8");
		} catch (Exception e) {
			return null;
		}
	}

	/***
	 * 生成32位md5码
	 */
	public static String string2MD5(String inStr) throws Exception{
		char hexDigits[] =
				{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		try {
			byte[] strTemp = inStr.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			throw e;
		}
	}

}
