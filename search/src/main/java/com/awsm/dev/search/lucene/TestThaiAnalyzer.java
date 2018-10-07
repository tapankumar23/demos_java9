package com.awsm.dev.search.lucene;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.th.ThaiAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

public class TestThaiAnalyzer {

	public static void main(String[] args) throws Exception {
		testAnalyzer();
	}

	public static void assertAnalyzesTo(Analyzer a, String input, String[] output) throws Exception {
		TokenStream ts = a.tokenStream("dummy", new StringReader(input));
		List<String> tokenList = new ArrayList<String>();
		CharTermAttribute token = ts.getAttribute(CharTermAttribute.class);
		ts.reset();
		while (ts.incrementToken()) {
			tokenList.add(token.toString());
		}
		System.out.println(tokenList);
		ts.close();
	}

	public static void testAnalyzer() throws Exception {
		ThaiAnalyzer analyzer = new ThaiAnalyzer();
		assertAnalyzesTo(analyzer, "", new String[] {});
		assertAnalyzesTo(analyzer, "การที่ได้ต้องแสดงว่างานดี", new String[] { "การ", "ที่", "ได้", "ต้อง", "แสดง", "ว่า", "งาน", "ดี" });
		assertAnalyzesTo(analyzer, "บริษัทชื่อ XY&Z - คุยกับ xyz@demo.com", new String[] { "บริษัท", "ชื่อ", "xy&z", "คุย", "กับ", "xyz@demo.com" });
		// English stop words
		assertAnalyzesTo(analyzer, "ประโยคว่า The quick brown fox jumped over the lazy dogs", new String[] { "ประโยค", "ว่า", "quick", "brown", "fox", "jumped", "over", "lazy", "dogs" });
	}
}