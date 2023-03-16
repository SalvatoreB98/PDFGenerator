package com.pdf.generator.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Writer;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.xhtmlrenderer.extend.FontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfName;
import com.lowagie.text.pdf.PdfString;
import com.pdf.generator.service.PDFServiceGenerator;




@Service
public class PDFServiceGeneratorImpl implements PDFServiceGenerator {
	private ArrayList<Item> listItems = new ArrayList<>();
	@Override
	public byte[] htmlToPdf2()   {
		try {
			
		

		ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		templateResolver.setPrefix("templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode(TemplateMode.HTML);

		TemplateEngine templateEngine = new TemplateEngine();
		templateEngine.setTemplateResolver(templateResolver);
		Context context = new Context();
		for(int i=0; i<10; i++){
			this.listItems.add(new Item("articolo" + i, "desc" + i, "" + i, 1000 + i + "", null, null, null , null, null, null, null));
		}
		System.out.println(listItems.get(0).getArticle());
		
		context.setVariable("size", this.listItems.size());
		context.setVariable("items", this.listItems);
		context.setVariable("code", "codes");
		
		 
		
	
		String html = templateEngine.process("htmlToPdf", context);

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); 
		 

		
		ITextRenderer renderer = new ITextRenderer();
		
		FontResolver resolver = renderer.getFontResolver();
	 
	 	renderer.setDocumentFromString(html);
		 
		
		
		
		renderer.layout();
	 
		 
	
		 
		
		renderer.createPDF(byteArrayOutputStream, false);
		renderer.getWriter().getInfo().put(PdfName.TITLE, new PdfString("MIO TITOLO PDF"));
		renderer.getWriter().getInfo().put(PdfName.CREATOR, new PdfString("NTT PDF PER ARMONIA"));
		renderer.getWriter().getInfo().put(PdfName.AUTHOR, new PdfString("ARMONIA"));
		renderer.getWriter().getInfo().put(PdfName.PRODUCER, new PdfString("NTTDATA"));
		renderer.getWriter().getInfo().put(PdfName.KEYWORDS, new PdfString("CHIAVE SEGRETA"));
		renderer.getWriter().getInfo().put(PdfName.SUBJECT, new PdfString("SUBJECT PDF"));
		
 

		
		renderer.finishPDF();


	 

		return byteArrayOutputStream.toByteArray();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;

	}
	public void addListItems(){
	}

}
