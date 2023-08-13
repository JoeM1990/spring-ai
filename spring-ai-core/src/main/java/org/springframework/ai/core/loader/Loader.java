package org.springframework.ai.core.loader;

import org.springframework.ai.core.loader.splitter.TextSplitter;

import java.util.List;

public interface Loader {

	List<Document> load();

	List<Document> load(TextSplitter textSplitter);

}
