package com.pdf.generator.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 
import com.pdf.generator.service.PDFServiceGenerator;

@RestController
public class PDFController {

	Logger logger = LoggerFactory.getLogger(PDFController.class);
	
	@Autowired
	private PDFServiceGenerator pdfServiceGenerator;
	
	
	@GetMapping(path = "/htmlToPdfLibThymeleaf")
	public ResponseEntity<byte[]> htmlToPdf() throws IOException {

		try {

			byte[] pdfBytes = pdfServiceGenerator.htmlToPdf2();

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_PDF);
			headers.add("Content-Disposition", "attachment; filename=provaX2.pdf");
			headers.setContentLength(pdfBytes.length);
			return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);

		} catch (Exception ex) {

			logger.error(ex.getMessage());
		}
		return null;

	}
}
