package com.awsm.dev.search.lucene;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
//import org.apache.lucene.analysis.icu.segmentation.ICUTokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

public class TokenizeThaiSentence {

	public static void main(String[] args) throws IOException {
	    Reader reader = new StringReader("การที่ได้ต้องแสดงว่างานดี  This is a test ກວ່າດອກ");
	    /*ICUTokenizer icut = new ICUTokenizer();
	    icut.setReader(reader);
	    icut.addAttribute(CharTermAttribute.class);
	    icut.reset();
	    while (icut.incrementToken()) {
	        System.out.println(icut.toString());
	        System.out.println(icut.getAttribute(CharTermAttribute.class));
	    }
	    icut.close();*/
	}
}
