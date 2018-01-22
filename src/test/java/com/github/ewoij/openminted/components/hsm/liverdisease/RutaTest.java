package com.github.ewoij.openminted.components.hsm.liverdisease;

import java.io.IOException;
import java.util.Collection;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.junit.Assert;
import org.junit.Test;

import de.tudarmstadt.ukp.dkpro.core.api.ner.type.Disease;

public class RutaTest {

	@Test
	public void test() throws IOException, UIMAException {
		JCas jcas = JCasFactory.createJCas();
		jcas.setDocumentText("NAFLD");
		AnalysisEngineDescription aed = AnalysisEngineFactory.createEngineDescriptionFromPath("target/generated-sources/ruta/descriptor/com/github/ewoij/openminted/components/hsm/liverdisease/LiverDiseaseMainRutaAnnotator.xml");
		SimplePipeline.runPipeline(jcas, aed);
		Collection<Disease> select = JCasUtil.select(jcas, Disease.class);
		Assert.assertEquals(1, select.size());
		Disease annotation = select.iterator().next();
		Assert.assertEquals("NAFLD", annotation.getCoveredText());
		Assert.assertEquals("Nonalcoholic Fatty Liver Disease", annotation.getValue());
	}

}
