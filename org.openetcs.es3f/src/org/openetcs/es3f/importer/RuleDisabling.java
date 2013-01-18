package org.openetcs.es3f.importer;

import org.eclipse.emf.ecp.core.ECPProject;
import org.openetcs.model.ertmsformalspecs.*;
import org.openetcs.model.ertmsformalspecs.behaviour.*;
import org.openetcs.model.ertmsformalspecs.customization.*;
import org.openetcs.model.ertmsformalspecs.requirements.*;
import org.openetcs.model.ertmsformalspecs.requirements.messages.*;
import org.openetcs.model.ertmsformalspecs.shortcut.*;
import org.openetcs.model.ertmsformalspecs.test.*;
import org.openetcs.model.ertmsformalspecs.translation.*;
import org.openetcs.model.ertmsformalspecs.types.*;
import org.openetcs.model.ertmsformalspecs.util.*;
import org.openetcs.es3f.importer.utils.*;

public class RuleDisabling
	extends org.openetcs.es3f.importer.generated.RuleDisabling
{
	private static final long serialVersionUID = 2829494552401902687L;

	public org.openetcs.model.ertmsformalspecs.customization.RuleDisabling convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.customization.RuleDisabling retVal = CustomizationFactory.eINSTANCE.createRuleDisabling();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		retVal.setVerified(getVerified());
		retVal.setNeedsRequirement(getNeedsRequirement());
		if ( allRequirements() != null )
		{
			for ( Object obj: allRequirements())
			{
				retVal.getRequirements().add(((ReqRef) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());

		// Handles the translation of Rule
		ManualTranslation.translateRuleDisabling ( project, this, retVal );

		return retVal;
	}
}
