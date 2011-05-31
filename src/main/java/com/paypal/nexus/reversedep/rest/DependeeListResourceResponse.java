package com.paypal.nexus.reversedep.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.sonatype.nexus.rest.model.NexusResponse;

import com.paypal.nexus.reversedep.store.Artifact;

@XmlRootElement(name = "dependeeresponse")
public class DependeeListResourceResponse extends NexusResponse implements
		Serializable {

	private static final long serialVersionUID = -4492092221347656388L;

	private List<Artifact> data = new ArrayList<Artifact>();

	@XmlElementWrapper(name = "data")
	@XmlElement(name = "node")
	public List<Artifact> getData() {
		return data;
	}

	public void addDependee(Artifact dependee) {
		this.data.add(dependee);
	}
}