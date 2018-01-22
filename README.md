# Liver disease tagger

UIMA ruta analysis engine annotating liver diseases. This artifact is meant to be used as a component on the OpenMinted platform, it can however be used in any UIMA Fit pipeline.

Annotation type:
 - [de.tudarmstadt.ukp.dkpro.core.api.ner.type.Disease](https://dkpro.github.io/dkpro-core/releases/1.9.0/docs/typesystem-reference.html#type-de.tudarmstadt.ukp.dkpro.core.api.ner.type.Disease)
 - The "value" property is assigned a unique disease name among synonyms.

Annotator:
 - Using ruta [MARKTABLE](https://uima.apache.org/d/ruta-current/tools.ruta.book.html#ugr.tools.ruta.language.actions.marktable)

Ontology used:
 - subset of [NCI-Thesaurus](https://github.com/NCI-Thesaurus/thesaurus-obo-edition)
