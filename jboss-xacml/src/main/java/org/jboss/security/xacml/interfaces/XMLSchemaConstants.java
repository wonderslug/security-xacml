/*
  * JBoss, Home of Professional Open Source
  * Copyright 2007, JBoss Inc., and individual contributors as indicated
  * by the @authors tag. See the copyright.txt in the distribution for a
  * full listing of individual contributors.
  *
  * This is free software; you can redistribute it and/or modify it
  * under the terms of the GNU Lesser General Public License as
  * published by the Free Software Foundation; either version 2.1 of
  * the License, or (at your option) any later version.
  *
  * This software is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
  * Lesser General Public License for more details.
  *
  * You should have received a copy of the GNU Lesser General Public
  * License along with this software; if not, write to the Free
  * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
  */
package org.jboss.security.xacml.interfaces;

/**
 *  Defines the constants for XML Schema
 *  @author Anil.Saldhana@redhat.com
 *  @since  Jul 20, 2007 
 *  @version $Revision$
 */
public interface XMLSchemaConstants
{
   String DATATYPE_ANYURI = "http://www.w3.org/2001/XMLSchema#anyURI";

   String DATATYPE_BASE64BINARY = "http://www.w3.org/2001/XMLSchema#base64Binary";

   String DATATYPE_BOOLEAN = "http://www.w3.org/2001/XMLSchema#boolean";

   String DATATYPE_DATE = "http://www.w3.org/2001/XMLSchema#date";

   String DATATYPE_DATE_TIME = "http://www.w3.org/2001/XMLSchema#dateTime";

   String DATATYPE_DOUBLE = "http://www.w3.org/2001/XMLSchema#double";

   String DATATYPE_HEXBINARY = "http://www.w3.org/2001/XMLSchema#hexBinary";

   String DATATYPE_INTEGER = "http://www.w3.org/2001/XMLSchema#integer";

   String DATATYPE_STRING = "http://www.w3.org/2001/XMLSchema#string";

   String DATATYPE_TIME = "http://www.w3.org/2001/XMLSchema#time";

   String DATATYPE_DAYTIMEDURATION = "http://www.w3.org/TR/2002/WD-xquery-operators-20020816#dayTimeDuration";

   String DATATYPE_YEARMONTHDURATION = "http://www.w3.org/TR/2002/WD-xquery-operators-20020816#yearMonthDuration";

   String DATATYPE_DNSNAME = "urn:oasis:names:tc:xacml:2.0:data-type:dnsName";

   String DATATYPE_IPADDRESS = "urn:oasis:names:tc:xacml:2.0:data-type:ipAddress";

   String DATATYPE_RFC822NAME = "urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name";

   String DATATYPE_X500NAME = "urn:oasis:names:tc:xacml:1.0:data-type:x500Name";
}
