
package simplejws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.9
 * Wed Oct 19 14:28:12 IST 2022
 * Generated source version: 2.7.9
 */

@XmlRootElement(name = "hello", namespace = "http://simplejws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hello", namespace = "http://simplejws/")

public class Hello {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}

