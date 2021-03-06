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
package org.jboss.security.xacml.locators;

import java.util.Set;

import org.jboss.security.xacml.bridge.WrapperPolicyFinderModule;
import org.jboss.security.xacml.interfaces.XACMLConstants;
import org.jboss.security.xacml.interfaces.XACMLPolicy;
import org.jboss.security.xacml.sunxacml.Policy;

/**
 *  Policy Locator for plain XACML Policy instances
 *  @author Anil.Saldhana@redhat.com
 *  @since  Jul 6, 2007 
 *  @version $Revision$
 */
public class JBossPolicyLocator extends AbstractJBossPolicyLocator
{ 
   public JBossPolicyLocator()
   {
   }

   public JBossPolicyLocator(Set<XACMLPolicy> policies)
   {
      setPolicies(policies);
   }

   @Override
   public void setPolicies(Set<XACMLPolicy> policies)
   {
      this.policies = policies;
      
      for (XACMLPolicy xp : policies)
      {
         if (xp.getType() == XACMLPolicy.POLICY)
         {
            Policy p = xp.get(XACMLConstants.UNDERLYING_POLICY);
            WrapperPolicyFinderModule wpfm = new WrapperPolicyFinderModule(p);
            pfml.add(wpfm);
         }
      }
      this.map.put(XACMLConstants.POLICY_FINDER_MODULE, pfml);
   }
}