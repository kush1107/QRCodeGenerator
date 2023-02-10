package com.qa.dummytest;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QR_CodeGenerator {
	
	  private static final String qcip = "D:\\ShairuFramework\\src\\main\\java\\com\\qa\\dummytest\\qa.png";
	  private static void generateQRCode(String text, int width, int height, String filePath)
	            throws Exception {
	        QRCodeWriter qcwobj = new QRCodeWriter();
	        BitMatrix bmobj = qcwobj.encode(text, BarcodeFormat.QR_CODE, width, height);
	        Path pobj = FileSystems.getDefault().getPath(filePath);
	        MatrixToImageWriter.writeToPath(bmobj, "PNG", pobj);
	    }
	    public static void main(String[] args) {
	        try {
	            generateQRCode("Hello Kavisha Please Practice Java !! Okayy",1250, 1250, qcip);
	        } catch (Exception e) {
	            System.out.println("Could not generate QR Code" + e);
	        } 

	        System.out.println("Your QR is Generated");
}
	    
}
