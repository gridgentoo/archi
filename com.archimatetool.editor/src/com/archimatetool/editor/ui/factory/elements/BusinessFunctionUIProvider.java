/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.ui.factory.elements;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.archimatetool.editor.diagram.editparts.ArchimateElementEditPart;
import com.archimatetool.editor.diagram.figures.elements.FunctionFigure;
import com.archimatetool.editor.ui.ColorFactory;
import com.archimatetool.editor.ui.IArchiImages;
import com.archimatetool.model.IArchimatePackage;



/**
 * Business Function UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class BusinessFunctionUIProvider extends AbstractArchimateElementUIProvider {

    @Override
    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getBusinessFunction();
    }
    
    @Override
    public EditPart createEditPart() {
        return new ArchimateElementEditPart(FunctionFigure.class);
    }

    @Override
    public String getDefaultName() {
        return Messages.BusinessFunctionUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IArchiImages.ImageFactory.getImage(IArchiImages.ICON_BUSINESS_FUNCTION);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IArchiImages.ImageFactory.getImageDescriptor(IArchiImages.ICON_BUSINESS_FUNCTION);
    }
    
    @Override
    public Color getDefaultColor() {
        return ColorFactory.get(255, 255, 181);
    }
    
    @Override
    public boolean hasAlternateFigure() {
        return true;
    }
}
