/*
 * Copyright (c) 2010 Zepheira LLC, Some rights reserved.
 * 
 * Source code developed for this project is licensed under the Apache
 * License, Version 2.0. See the file LICENSE.txt for details.
 */
package name.persistent.concepts;

import org.openrdf.repository.object.annotations.iri;

/** A partial PURL with a path endings with '/'. */
@iri("http://persistent.name/rdf/2010/purl#Partial")
public interface Partial extends PURL {
	/** Parent domain to this partial. */
	@iri("http://persistent.name/rdf/2010/purl#belongsTo")
	Domain getBelongsTo();
	/** Parent domain to this partial. */
	@iri("http://persistent.name/rdf/2010/purl#belongsTo")
	void setBelongsTo(Domain purlBelongsTo);

	/** Regular Expression of a source URI, used to populate URI target templates */
	@iri("http://persistent.name/rdf/2010/purl#pattern")
	String getPurlPattern();
	/** Regular Expression of a source URI, used to populate URI target templates */
	@iri("http://persistent.name/rdf/2010/purl#pattern")
	void setPurlPattern(String purlPattern);

}
