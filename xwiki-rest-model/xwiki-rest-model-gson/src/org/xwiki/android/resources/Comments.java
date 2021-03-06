//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.02 at 07:04:45 PM IST 
//

package org.xwiki.android.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlRootElement;
 import javax.xml.bind.annotation.XmlType;
 */

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xwiki.org}LinkCollection">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.xwiki.org}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
/*
 * //@XmlAccessorType(XmlAccessType.FIELD) //@XmlType(name = "", propOrder = { "comments" }) //@XmlRootElement(name =
 * "comments")
 */
public class Comments extends LinkCollection
{

    // @XmlElement(name = "comment")
    public List<Comment> comments;

    /**
     * Gets the value of the comments property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the comments property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getComments().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Comment }
     */
    public List<Comment> getComments()
    {
        if (comments == null) {
            comments = new ArrayList<Comment>();
        }
        return this.comments;
    }

    public Comments withComments(Comment... values)
    {
        if (values != null) {
            for (Comment value : values) {
                getComments().add(value);
            }
        }
        return this;
    }

    public Comments withComments(Collection<Comment> values)
    {
        if (values != null) {
            getComments().addAll(values);
        }
        return this;
    }

    @Override
    public Comments withLinks(Link... values)
    {
        if (values != null) {
            for (Link value : values) {
                getLinks().add(value);
            }
        }
        return this;
    }

    @Override
    public Comments withLinks(Collection<Link> values)
    {
        if (values != null) {
            getLinks().addAll(values);
        }
        return this;
    }

}
