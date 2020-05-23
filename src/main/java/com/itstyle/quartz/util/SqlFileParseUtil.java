package com.itstyle.quartz.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**类说明:sql文件解析工具类
 * @author dhm
 * 2020年3月11日
 */
public final class SqlFileParseUtil {
	
	/**
	 * 方法说明:字节流方式解析sql文件获取sql
	 * @param filePath 文件路径
	 * @return sql语句
	 */
	public static final String loadSql(String filePath) {
		InputStream is=null;
		StringBuffer sb= new StringBuffer();
		try {
			is = new FileInputStream(filePath);
			byte[] buff = new byte[1024];
			int byteRead = 0;
			while((byteRead = is.read(buff))!= -1) {
				sb.append(new String(buff, 0, byteRead, "GB2312"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return sb.toString();
	}
	
	/**
	 * 方法说明:字符流解析sql文件获取sql，中文有乱码
	 * @param filePath 文件路径
	 * @return sql语句
	 */
	public static final String loadSql2(String filePath) {
		FileReader fr=null;
		BufferedReader br = null;
		StringBuffer sb=new StringBuffer();
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			String s = "";
			while((s = br.readLine())!= null) {
				sb.append(s).append("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		String filePath = "d_ddl.dmn_branch_aggr.sql";
		
		System.out.println(filePath.split("\\.").length);
//		System.out.println(loadSql(filePath));
//		
//		System.out.println(loadSql(filePath).replaceAll("\r\n|\r|\n", "<br/>"));
//		
//		System.out.println(loadSql(filePath).replaceAll("\r\n|\r|\n", "<br/>").replaceAll("<br/>", "\n"));
	}

}
