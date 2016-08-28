/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.model.viewpoints;

import org.eclipse.emf.ecore.EClass;

import com.archimatetool.model.IArchimatePackage;


/**
 * Implementation & Migration Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public class ImplementationMigrationViewpoint extends AbstractViewpoint {
    
    EClass[] allowed = new EClass[] {
            IArchimatePackage.eINSTANCE.getBusinessActor(),
            IArchimatePackage.eINSTANCE.getBusinessRole(),
            IArchimatePackage.eINSTANCE.getBusinessCollaboration(),
            IArchimatePackage.eINSTANCE.getBusinessInterface(),
            IArchimatePackage.eINSTANCE.getBusinessFunction(),
            IArchimatePackage.eINSTANCE.getBusinessProcess(),
            IArchimatePackage.eINSTANCE.getBusinessEvent(),
            IArchimatePackage.eINSTANCE.getBusinessInteraction(),
            IArchimatePackage.eINSTANCE.getProduct(),
            IArchimatePackage.eINSTANCE.getBusinessService(),
            IArchimatePackage.eINSTANCE.getRepresentation(),
            IArchimatePackage.eINSTANCE.getBusinessObject(),
            IArchimatePackage.eINSTANCE.getLocation(),
            
            IArchimatePackage.eINSTANCE.getApplicationComponent(),
            IArchimatePackage.eINSTANCE.getApplicationCollaboration(),
            IArchimatePackage.eINSTANCE.getApplicationInterface(),
            IArchimatePackage.eINSTANCE.getApplicationService(),
            IArchimatePackage.eINSTANCE.getApplicationFunction(),
            IArchimatePackage.eINSTANCE.getApplicationInteraction(),
            IArchimatePackage.eINSTANCE.getDataObject(),

            IArchimatePackage.eINSTANCE.getArtifact(),
            IArchimatePackage.eINSTANCE.getPath(),
            IArchimatePackage.eINSTANCE.getCommunicationNetwork(),
            IArchimatePackage.eINSTANCE.getTechnologyInterface(),
            IArchimatePackage.eINSTANCE.getTechnologyFunction(),
            IArchimatePackage.eINSTANCE.getTechnologyService(),
            IArchimatePackage.eINSTANCE.getNode(),
            IArchimatePackage.eINSTANCE.getSystemSoftware(),
            IArchimatePackage.eINSTANCE.getDevice(),
            
            IArchimatePackage.eINSTANCE.getWorkPackage(),
            IArchimatePackage.eINSTANCE.getDeliverable(),
            IArchimatePackage.eINSTANCE.getPlateau(),
            IArchimatePackage.eINSTANCE.getGap(),
            IArchimatePackage.eINSTANCE.getGoal(),
            IArchimatePackage.eINSTANCE.getRequirement(),
            IArchimatePackage.eINSTANCE.getConstraint(),
            
            IArchimatePackage.eINSTANCE.getAndJunction(),
            IArchimatePackage.eINSTANCE.getOrJunction(),
            
            IArchimatePackage.eINSTANCE.getSpecializationRelationship(),
            IArchimatePackage.eINSTANCE.getCompositionRelationship(),
            IArchimatePackage.eINSTANCE.getAggregationRelationship(),
            IArchimatePackage.eINSTANCE.getAssignmentRelationship(),
            IArchimatePackage.eINSTANCE.getRealizationRelationship(),
            IArchimatePackage.eINSTANCE.getTriggeringRelationship(),
            IArchimatePackage.eINSTANCE.getFlowRelationship(),
            IArchimatePackage.eINSTANCE.getServingRelationship(),
            IArchimatePackage.eINSTANCE.getAccessRelationship(),
            IArchimatePackage.eINSTANCE.getAssociationRelationship()
    };
    
    @Override
    public String getName() {
        return Messages.ImplementationMigrationViewpoint_0;
    }

    @Override
    public int getIndex() {
        return IMPLEMENTATION_MIGRATION_VIEWPOINT;
    }
    
    @Override
    public EClass[] getAllowedTypes() {
        return allowed;
    }
}