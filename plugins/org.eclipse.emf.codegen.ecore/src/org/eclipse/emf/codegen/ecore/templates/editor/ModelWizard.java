package org.eclipse.emf.codegen.ecore.templates.editor;

import org.eclipse.emf.codegen.ecore.genmodel.*;

public class ModelWizard
{
  protected final String NL = System.getProperties().getProperty("line.separator");
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL + "" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.Collections;" + NL + "import java.util.HashMap;" + NL + "import java.util.Iterator;" + NL + "import java.util.List;" + NL + "import java.util.Map;" + NL + "import java.util.StringTokenizer;" + NL + "" + NL + "import org.eclipse.emf.common.util.URI;" + NL + "" + NL + "import org.eclipse.emf.ecore.EClass;" + NL + "import org.eclipse.emf.ecore.EClassifier;" + NL + "" + NL + "import org.eclipse.emf.ecore.resource.Resource;" + NL + "import org.eclipse.emf.ecore.resource.ResourceSet;" + NL + "" + NL + "import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;" + NL + "" + NL + "import org.eclipse.emf.ecore.EObject;" + NL + "" + NL + "import org.eclipse.emf.ecore.xmi.XMLResource;" + NL + "" + NL + "import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;" + NL;
  protected final String TEXT_6 = NL + "import org.eclipse.core.resources.IContainer;" + NL + "import org.eclipse.core.resources.IFile;" + NL + "import org.eclipse.core.resources.IFolder;" + NL + "import org.eclipse.core.resources.IProject;" + NL + "import org.eclipse.core.resources.IResource;" + NL + "import org.eclipse.core.resources.ResourcesPlugin;" + NL;
  protected final String TEXT_7 = NL + "import org.eclipse.core.runtime.IProgressMonitor;" + NL + "" + NL + "import org.eclipse.jface.dialogs.MessageDialog;" + NL + "" + NL + "import org.eclipse.jface.viewers.IStructuredSelection;" + NL + "" + NL + "import org.eclipse.jface.wizard.Wizard;" + NL + "import org.eclipse.jface.wizard.WizardPage;" + NL + "" + NL + "import org.eclipse.swt.SWT;" + NL + "" + NL + "import org.eclipse.swt.events.SelectionAdapter;" + NL + "import org.eclipse.swt.events.SelectionEvent;" + NL + "" + NL + "import org.eclipse.swt.layout.GridData;" + NL + "import org.eclipse.swt.layout.GridLayout;" + NL + "" + NL + "import org.eclipse.swt.widgets.Combo;" + NL + "import org.eclipse.swt.widgets.Composite;" + NL + "import org.eclipse.swt.widgets.Label;" + NL + "" + NL + "import org.eclipse.ui.INewWizard;" + NL + "import org.eclipse.ui.IWorkbench;" + NL;
  protected final String TEXT_8 = NL + "import org.eclipse.ui.actions.WorkspaceModifyOperation;" + NL + "" + NL + "import org.eclipse.ui.dialogs.WizardNewFileCreationPage;" + NL + "" + NL + "import org.eclipse.ui.part.FileEditorInput;" + NL + "import org.eclipse.ui.part.ISetSelectionTarget;" + NL;
  protected final String TEXT_9 = NL + "import ";
  protected final String TEXT_10 = ";" + NL + "import ";
  protected final String TEXT_11 = ";" + NL + NL;
  protected final String TEXT_12 = NL + NL + NL + "/**" + NL + " * This is a simple wizard for creating a new model file." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_13 = " extends Wizard implements INewWizard" + NL + "{";
  protected final String TEXT_14 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_15 = " copyright = \"";
  protected final String TEXT_16 = "\";";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = NL + "\t/**" + NL + "\t * This caches an instance of the model package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = " = ";
  protected final String TEXT_21 = ".eINSTANCE;" + NL + "" + NL + "\t/**" + NL + "\t * This caches an instance of the model factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = " = ";
  protected final String TEXT_24 = ".get";
  protected final String TEXT_25 = "();" + NL;
  protected final String TEXT_26 = NL + "\t/**" + NL + "\t * This is the file creation page." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_27 = "NewFileCreationPage newFileCreationPage;" + NL;
  protected final String TEXT_28 = NL + "\t/**" + NL + "\t * This is the file creation page." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_29 = "InitialObjectCreationPage initialObjectCreationPage;" + NL + "" + NL + "\t/**" + NL + "\t * Remember the selection during initialization for populating the default container." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IStructuredSelection selection;" + NL + "" + NL + "\t/**" + NL + "\t * Remember the workbench during initialization." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IWorkbench workbench;" + NL + "" + NL + "\t/**" + NL + "\t * This just records the information." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void init(IWorkbench workbench, IStructuredSelection selection)" + NL + "\t{" + NL + "\t\tthis.workbench = workbench;" + NL + "\t\tthis.selection = selection;" + NL + "\t\tsetWindowTitle(";
  protected final String TEXT_30 = ".INSTANCE.getString(\"_UI_Wizard_label\"));";
  protected final String TEXT_31 = NL + "\t\tsetDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(";
  protected final String TEXT_32 = ".INSTANCE.getImage(\"full/wizban/New";
  protected final String TEXT_33 = "\")));";
  protected final String TEXT_34 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Create a new model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tEObject createInitialModel()" + NL + "\t{";
  protected final String TEXT_35 = NL + "\t\tEClass eClass = (EClass)";
  protected final String TEXT_36 = ".getEClassifier(initialObjectCreationPage.getInitialObjectName());" + NL + "\t\tEObject rootObject = ";
  protected final String TEXT_37 = ".create(eClass);";
  protected final String TEXT_38 = NL + "\t\tEClass eClass = ";
  protected final String TEXT_39 = ".INSTANCE.getDocumentRoot(";
  protected final String TEXT_40 = ");" + NL + "\t\tEStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(initialObjectCreationPage.getInitialObjectName());" + NL + "\t\tEObject rootObject = ";
  protected final String TEXT_41 = ".create(eClass);" + NL + "\t\trootObject.eSet(eStructuralFeature, ";
  protected final String TEXT_42 = ".create((EClass)eStructuralFeature.getEType()));";
  protected final String TEXT_43 = NL + "\t\treturn rootObject;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Do the work after everything is specified." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean performFinish()" + NL + "\t{" + NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_44 = NL + "\t\t\t// Get the URI of the model file." + NL + "\t\t\t//" + NL + "\t\t\tfinal URI fileURI = getModelURI();" + NL + "\t\t\tif (new ";
  protected final String TEXT_45 = "(fileURI.toFileString()).exists())" + NL + "\t\t\t{" + NL + "\t\t\t\tif (!MessageDialog.openQuestion(" + NL + "\t\t\t\t\tgetShell()," + NL + "\t\t\t\t\t";
  protected final String TEXT_46 = ".INSTANCE.getString(\"_UI_Question_title\"), ";
  protected final String TEXT_47 = NL + "\t\t\t\t\t";
  protected final String TEXT_48 = ".INSTANCE.getString(\"_WARN_FileConflict\", new String []{ fileURI.toFileString() }))) ";
  protected final String TEXT_49 = NL + "        \t\t{" + NL + "\t\t\t\t\tinitialObjectCreationPage.selectFileField();" + NL + "\t\t\t\t\treturn false;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t// Do the work within an operation." + NL + "\t\t\t//" + NL + "\t\t\t";
  protected final String TEXT_50 = " operation = new ";
  protected final String TEXT_51 = "()" + NL + "\t\t\t{" + NL + "\t\t\t\tpublic void run(IProgressMonitor progressMonitor) throws ";
  protected final String TEXT_52 = ", InterruptedException";
  protected final String TEXT_53 = NL + "\t\t\t// Remember the file." + NL + "\t\t\t//" + NL + "\t\t\tfinal IFile modelFile = getModelFile();" + NL + "" + NL + "\t\t\t// Do the work within an operation." + NL + "\t\t\t//" + NL + "\t\t\tWorkspaceModifyOperation operation =" + NL + "\t\t\t\tnew WorkspaceModifyOperation()" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tprotected void execute(IProgressMonitor progressMonitor)";
  protected final String TEXT_54 = NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\ttry" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t// Create a resource set" + NL + "\t\t\t\t\t\t\t//" + NL + "\t\t\t\t\t\t\tResourceSet resourceSet = new ResourceSetImpl();" + NL;
  protected final String TEXT_55 = NL + "\t\t\t\t\t\t\t// Get the URI of the model file." + NL + "\t\t\t\t\t\t\t//" + NL + "\t\t\t\t\t\t\tURI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString());" + NL;
  protected final String TEXT_56 = NL + "\t\t\t\t\t\t\t// Create a resource for this file." + NL + "\t\t\t\t\t\t\t//" + NL + "\t\t\t\t\t\t\tResource resource = resourceSet.createResource(fileURI);" + NL + "" + NL + "\t\t\t\t\t\t\t// Add the initial model object to the contents." + NL + "\t\t\t\t\t\t\t//" + NL + "\t\t\t\t\t\t\tEObject rootObject = createInitialModel();" + NL + "\t\t\t\t\t\t\tif (rootObject != null)" + NL + "\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\tresource.getContents().add(rootObject);" + NL + "\t\t\t\t\t\t\t}" + NL + "" + NL + "\t\t\t\t\t\t\t// Save the contents of the resource to the file system." + NL + "\t\t\t\t\t\t\t//" + NL + "\t\t\t\t\t\t\tMap options = new HashMap();" + NL + "\t\t\t\t\t\t\toptions.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());" + NL + "\t\t\t\t\t\t\tresource.save(options);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\tcatch (Exception exception)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_57 = ".INSTANCE.log(exception);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\tfinally" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tprogressMonitor.done();" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t};" + NL + "" + NL + "\t\t\tgetContainer().run(false, false, operation);" + NL;
  protected final String TEXT_58 = NL + "\t\t\treturn ";
  protected final String TEXT_59 = ".openEditor(workbench, fileURI);\t\t\t";
  protected final String TEXT_60 = NL + "\t\t\t// Select the new file resource in the current view." + NL + "\t\t\t//" + NL + "\t\t\t";
  protected final String TEXT_61 = " workbenchWindow = workbench.getActiveWorkbenchWindow();" + NL + "\t\t\t";
  protected final String TEXT_62 = " page = workbenchWindow.getActivePage();" + NL + "\t\t\tfinal ";
  protected final String TEXT_63 = " activePart = page.getActivePart();" + NL + "\t\t\tif (activePart instanceof ISetSelectionTarget)" + NL + "\t\t\t{" + NL + "\t\t\t\tfinal ";
  protected final String TEXT_64 = " targetSelection = new ";
  protected final String TEXT_65 = "(modelFile);" + NL + "\t\t\t\tgetShell().getDisplay().asyncExec" + NL + "\t\t\t\t\t(new Runnable()" + NL + "\t\t\t\t\t {" + NL + "\t\t\t\t\t\t public void run()" + NL + "\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t ((ISetSelectionTarget)activePart).selectReveal(targetSelection);" + NL + "\t\t\t\t\t\t }" + NL + "\t\t\t\t\t });" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// Open an editor on the new file." + NL + "\t\t\t//" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\tpage.openEditor" + NL + "\t\t\t\t\t(new FileEditorInput(modelFile)," + NL + "\t\t\t\t\t workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_66 = " exception)" + NL + "\t\t\t{" + NL + "\t\t\t\tMessageDialog.openError(workbenchWindow.getShell(), ";
  protected final String TEXT_67 = ".INSTANCE.getString(\"_UI_OpenEditorError_label\"), exception.getMessage());";
  protected final String TEXT_68 = NL + "\t\t\t\treturn false;" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\treturn true;";
  protected final String TEXT_69 = NL + "\t\t}" + NL + "\t\tcatch (Exception exception)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_70 = ".INSTANCE.log(exception);" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_71 = NL + "\t/**" + NL + "\t * This is the one page of the wizard." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic class ";
  protected final String TEXT_72 = "NewFileCreationPage extends WizardNewFileCreationPage" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * Remember the model file." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected IFile modelFile;" + NL + "" + NL + "\t\t/**" + NL + "\t\t * Pass in the selection." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic ";
  protected final String TEXT_73 = "NewFileCreationPage(String pageId, IStructuredSelection selection)" + NL + "\t\t{" + NL + "\t\t\tsuper(pageId, selection);" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * The framework calls this to see if the file is correct." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected boolean validatePage()" + NL + "\t\t{" + NL + "\t\t\tif (super.validatePage())" + NL + "\t\t\t{" + NL + "\t\t\t\t// Make sure the file ends in \".";
  protected final String TEXT_74 = "\"." + NL + "\t\t\t\t//" + NL + "\t\t\t\tString requiredExt = ";
  protected final String TEXT_75 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_76 = "FilenameExtension\");";
  protected final String TEXT_77 = NL + "\t\t\t\tString enteredExt = new ";
  protected final String TEXT_78 = "(getFileName()).getFileExtension();" + NL + "\t\t\t\tif (enteredExt == null || !enteredExt.equals(requiredExt))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsetErrorMessage(";
  protected final String TEXT_79 = ".INSTANCE.getString(\"_WARN_FilenameExtension\", new Object [] { requiredExt }));";
  protected final String TEXT_80 = NL + "\t\t\t\t\treturn false;" + NL + "\t\t\t\t}" + NL + "\t\t\t\telse" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\treturn true;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\telse" + NL + "\t\t\t{" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * Store the dialog field settings upon completion." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic boolean performFinish()" + NL + "\t\t{" + NL + "\t\t\tmodelFile = getModelFile();" + NL + "\t\t\treturn true;" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic IFile getModelFile()" + NL + "\t\t{" + NL + "\t\t\treturn" + NL + "\t\t\t\tmodelFile == null ?" + NL + "\t\t\t\t\tResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName())) :" + NL + "\t\t\t\t\tmodelFile;" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_81 = NL + "\t/**" + NL + "\t * This is the page where the type of object to create is selected." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic class ";
  protected final String TEXT_82 = "InitialObjectCreationPage extends WizardPage" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected String initialObjectName;" + NL;
  protected final String TEXT_83 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected URI fileURI;" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_84 = " fileField;" + NL;
  protected final String TEXT_85 = NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected Combo initialObjectField;" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t */" + NL + "\t\tprotected String encoding;" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected Combo encodingField;" + NL + "" + NL + "\t\t/**" + NL + "\t\t * Pass in the selection." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic ";
  protected final String TEXT_86 = "InitialObjectCreationPage(String pageId)" + NL + "\t\t{" + NL + "\t\t\tsuper(pageId);" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void createControl(Composite parent)" + NL + "\t\t{" + NL + "\t\t\tComposite composite = new Composite(parent, SWT.NONE);" + NL + "\t\t\t{" + NL + "\t\t\t\tGridLayout layout = new GridLayout();" + NL + "\t\t\t\tlayout.numColumns = 1;" + NL + "\t\t\t\tlayout.verticalSpacing = 12;" + NL + "\t\t\t\tcomposite.setLayout(layout);" + NL + "" + NL + "\t\t\t\tGridData data = new GridData();" + NL + "\t\t\t\tdata.verticalAlignment = GridData.FILL;" + NL + "\t\t\t\tdata.grabExcessVerticalSpace = true;" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.FILL;" + NL + "\t\t\t\tcomposite.setLayoutData(data);" + NL + "\t\t\t}" + NL;
  protected final String TEXT_87 = "\t\t\t" + NL + "\t\t\tLabel resourceURILabel = new Label(composite, SWT.LEFT);" + NL + "\t\t\t{" + NL + "\t\t\t\tresourceURILabel.setText(";
  protected final String TEXT_88 = ".INSTANCE.getString(\"_UI_File_label\"));";
  protected final String TEXT_89 = NL + NL + "\t\t\t\tGridData data = new GridData();" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.FILL;" + NL + "\t\t\t\tresourceURILabel.setLayoutData(data);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tComposite fileComposite = new Composite(composite, SWT.NONE);" + NL + "\t\t\t{" + NL + "\t\t\t\tGridData data = new GridData();" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.END;" + NL + "\t\t\t\tfileComposite.setLayoutData(data);" + NL + "" + NL + "\t\t\t\tGridLayout layout = new GridLayout();" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.FILL;" + NL + "\t\t\t\tlayout.marginHeight = 0;" + NL + "\t\t\t\tlayout.marginWidth = 0;" + NL + "\t\t\t\tlayout.numColumns = 2;" + NL + "\t\t\t\tfileComposite.setLayout(layout);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tfileField = new ";
  protected final String TEXT_90 = "(fileComposite, SWT.BORDER);" + NL + "\t\t\t{" + NL + "\t\t\t\tGridData data = new GridData();" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.FILL;" + NL + "\t\t\t\tdata.grabExcessHorizontalSpace = true;" + NL + "\t\t\t\tdata.horizontalSpan = 1;" + NL + "\t\t\t\tfileField.setLayoutData(data);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tfileField.addModifyListener(new ";
  protected final String TEXT_91 = "()" + NL + "\t\t\t{" + NL + "\t\t\t\tpublic void modifyText(";
  protected final String TEXT_92 = " e)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsetPageComplete(isPageComplete());" + NL + "\t\t\t\t}" + NL + "\t\t\t});" + NL + "" + NL + "\t\t\t";
  protected final String TEXT_93 = " resourceURIBrowseFileSystemButton = new ";
  protected final String TEXT_94 = "(fileComposite, SWT.PUSH);" + NL + "\t\t\tresourceURIBrowseFileSystemButton.setText(";
  protected final String TEXT_95 = ".INSTANCE.getString(\"_UI_Browse_label\"));";
  protected final String TEXT_96 = NL + NL + "\t\t\tresourceURIBrowseFileSystemButton.addSelectionListener(new SelectionAdapter()" + NL + "\t\t\t{" + NL + "\t\t\t\tpublic void widgetSelected(SelectionEvent event)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tString fileExtension = ";
  protected final String TEXT_97 = ".INSTANCE.getString(\"";
  protected final String TEXT_98 = "\");";
  protected final String TEXT_99 = NL + "\t\t\t\t\tString filePath = ";
  protected final String TEXT_100 = ".openFilePathDialog(getShell(), \"*.\"+fileExtension, ";
  protected final String TEXT_101 = ".OPEN);";
  protected final String TEXT_102 = NL + "\t\t\t\t\tif (filePath != null)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\t\t\tif (!filePath.endsWith(\".\"+fileExtension)) ";
  protected final String TEXT_103 = NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tfilePath = filePath + \".\" + fileExtension; ";
  protected final String TEXT_104 = NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\tfileField.setText(filePath);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t});" + NL;
  protected final String TEXT_105 = NL + "\t\t\tLabel containerLabel = new Label(composite, SWT.LEFT);" + NL + "\t\t\t{" + NL + "\t\t\t\tcontainerLabel.setText(";
  protected final String TEXT_106 = ".INSTANCE.getString(\"_UI_ModelObject\"));";
  protected final String TEXT_107 = NL + NL + "\t\t\t\tGridData data = new GridData();" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.FILL;" + NL + "\t\t\t\tcontainerLabel.setLayoutData(data);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tinitialObjectField = new Combo(composite, SWT.BORDER);" + NL + "\t\t\t{" + NL + "\t\t\t\tGridData data = new GridData();" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.FILL;" + NL + "\t\t\t\tdata.grabExcessHorizontalSpace = true;" + NL + "\t\t\t\tinitialObjectField.setLayoutData(data);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tList objectNames = new ArrayList();";
  protected final String TEXT_108 = NL + "\t\t\tfor (Iterator classifier = ";
  protected final String TEXT_109 = ".getEClassifiers().iterator(); classifier.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\tEClassifier eClassifier = (EClassifier)classifier.next();" + NL + "\t\t\t\tif (eClassifier instanceof EClass)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tEClass eClass = (EClass)eClassifier;" + NL + "\t\t\t\t\tif (!eClass.isAbstract())" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tobjectNames.add(eClass.getName());" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}";
  protected final String TEXT_110 = NL + "\t\t\tfor (Iterator elements = ";
  protected final String TEXT_111 = ".INSTANCE.getAllElements(";
  protected final String TEXT_112 = ".INSTANCE.getDocumentRoot(";
  protected final String TEXT_113 = ")).iterator(); elements.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_114 = " eStructuralFeature = (";
  protected final String TEXT_115 = ")elements.next();" + NL + "\t\t\t\tEClassifier eClassifier = eStructuralFeature.getEType();" + NL + "\t\t\t\tif (eClassifier instanceof EClass)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tEClass eClass = (EClass)eClassifier;" + NL + "\t\t\t\t\tif (!eClass.isAbstract())" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\t// objectNames.add(eClass.getName());" + NL + "\t\t\t\t\t\tobjectNames.add(eStructuralFeature.getName());" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}";
  protected final String TEXT_116 = NL + NL + "\t\t\tCollections.sort(objectNames, java.text.Collator.getInstance());" + NL + "\t\t\tfor (Iterator i = objectNames.iterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\tString objectName = (String)i.next();" + NL + "\t\t\t\tinitialObjectField.add(objectName);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tinitialObjectField.addSelectionListener" + NL + "\t\t\t\t(new SelectionAdapter()" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t public void widgetSelected(SelectionEvent e)" + NL + "\t\t\t\t\t {" + NL + "\t\t\t\t\t\t setPageComplete(isPageComplete());" + NL + "\t\t\t\t\t }" + NL + "\t\t\t\t });" + NL + "" + NL + "\t\t\tLabel encodingLabel = new Label(composite, SWT.LEFT);" + NL + "\t\t\t{" + NL + "\t\t\t\tencodingLabel.setText(";
  protected final String TEXT_117 = ".INSTANCE.getString(\"_UI_XMLEncoding\"));";
  protected final String TEXT_118 = NL + NL + "\t\t\t\tGridData data = new GridData();" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.FILL;" + NL + "\t\t\t\tencodingLabel.setLayoutData(data);" + NL + "\t\t\t}" + NL + "\t\t\tencodingField = new Combo(composite, SWT.BORDER);" + NL + "\t\t\t{" + NL + "\t\t\t\tGridData data = new GridData();" + NL + "\t\t\t\tdata.horizontalAlignment = GridData.FILL;" + NL + "\t\t\t\tdata.grabExcessHorizontalSpace = true;" + NL + "\t\t\t\tencodingField.setLayoutData(data);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tfor (StringTokenizer stringTokenizer = new StringTokenizer(";
  protected final String TEXT_119 = ".INSTANCE.getString(\"_UI_XMLEncodingChoices\")); stringTokenizer.hasMoreTokens(); )";
  protected final String TEXT_120 = NL + "\t\t\t{" + NL + "\t\t\t\tencodingField.add(stringTokenizer.nextToken());" + NL + "\t\t\t}" + NL + "\t\t\tencodingField.select(0);" + NL + "" + NL + "\t\t\tsetControl(composite);" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * The framework calls this to see if the file is correct." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic boolean isPageComplete()" + NL + "\t\t{";
  protected final String TEXT_121 = NL + "\t\t\treturn initialObjectField.getSelectionIndex() != -1 && fileField.getText().trim().length() > 0;";
  protected final String TEXT_122 = NL + "\t\t\tif (super.isPageComplete())" + NL + "\t\t\t{" + NL + "\t\t\t\treturn initialObjectField.getSelectionIndex() != -1;" + NL + "\t\t\t}" + NL + "\t\t\telse" + NL + "\t\t\t{" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}";
  protected final String TEXT_123 = NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * Store the dialog field settings upon completion." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic boolean performFinish()" + NL + "\t\t{";
  protected final String TEXT_124 = NL + "\t\t\tfileURI = getFileURI();";
  protected final String TEXT_125 = NL + "\t\t\tinitialObjectName = getInitialObjectName();" + NL + "\t\t\tencoding = getEncoding();" + NL + "\t\t\treturn true;" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic String getInitialObjectName()" + NL + "\t\t{" + NL + "\t\t\treturn" + NL + "\t\t\t\tinitialObjectName == null ?" + NL + "\t\t\t\t\tinitialObjectField.getText() :" + NL + "\t\t\t\t\tinitialObjectName;" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic String getEncoding()" + NL + "\t\t{" + NL + "\t\t\treturn" + NL + "\t\t\t\tencoding == null ?" + NL + "\t\t\t\t\tencodingField.getText() :" + NL + "\t\t\t\t\tencoding;" + NL + "\t\t}";
  protected final String TEXT_126 = NL + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic URI getFileURI()" + NL + "\t\t{" + NL + "\t\t\treturn fileField == null ? fileURI : URI.createFileURI(fileField.getText());" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void selectFileField()" + NL + "\t\t{" + NL + "\t\t\tif (fileField != null)" + NL + "\t\t\t{" + NL + "\t\t\t\tfileField.selectAll();" + NL + "\t\t\t\tfileField.setFocus();" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_127 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * The framework calls this to create the contents of the wizard." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void addPages()" + NL + "\t{";
  protected final String TEXT_128 = NL + "\t\t// Create a page, set the title, and the initial model file name." + NL + "\t\t//" + NL + "\t\tnewFileCreationPage = new ";
  protected final String TEXT_129 = "NewFileCreationPage(\"Whatever\", selection);";
  protected final String TEXT_130 = NL + "\t\tnewFileCreationPage.setTitle(";
  protected final String TEXT_131 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_132 = "_label\"));";
  protected final String TEXT_133 = NL + "\t\tnewFileCreationPage.setDescription(";
  protected final String TEXT_134 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_135 = "_description\"));";
  protected final String TEXT_136 = NL + "\t\tnewFileCreationPage.setFileName(";
  protected final String TEXT_137 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_138 = "FilenameDefaultBase\") + \".\" + ";
  protected final String TEXT_139 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_140 = "FilenameExtension\"));";
  protected final String TEXT_141 = NL + "\t\taddPage(newFileCreationPage);" + NL + "" + NL + "\t\t// Try and get the resource selection to determine a current directory for the file dialog." + NL + "\t\t//" + NL + "\t\tif (selection != null && !selection.isEmpty())" + NL + "\t\t{" + NL + "\t\t\t// Get the resource..." + NL + "\t\t\t//" + NL + "\t\t\tObject selectedElement = selection.iterator().next();" + NL + "\t\t\tif (selectedElement instanceof IResource)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Get the resource parent, if its a file." + NL + "\t\t\t\t//" + NL + "\t\t\t\tIResource selectedResource = (IResource)selectedElement;" + NL + "\t\t\t\tif (selectedResource.getType() == IResource.FILE)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tselectedResource = selectedResource.getParent();" + NL + "\t\t\t\t}" + NL + "" + NL + "\t\t\t\t// This gives us a directory..." + NL + "\t\t\t\t//" + NL + "\t\t\t\tif (selectedResource instanceof IFolder || selectedResource instanceof IProject)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t// Set this for the container." + NL + "\t\t\t\t\t//" + NL + "\t\t\t\t\tString currentDirectory = selectedResource.getLocation().toOSString();" + NL + "\t\t\t\t\tnewFileCreationPage.setContainerFullPath(selectedResource.getFullPath());" + NL + "" + NL + "\t\t\t\t\t// Make up a unique new name here." + NL + "\t\t\t\t\t//" + NL + "\t\t\t\t\tString defaultModelBaseFilename = ";
  protected final String TEXT_142 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_143 = "FilenameDefaultBase\");";
  protected final String TEXT_144 = NL + "\t\t\t\t\tString defaultModelFilenameExtension = ";
  protected final String TEXT_145 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_146 = "FilenameExtension\");";
  protected final String TEXT_147 = NL + "\t\t\t\t\tString modelFilename = defaultModelBaseFilename + \".\" + defaultModelFilenameExtension;";
  protected final String TEXT_148 = NL + "\t\t\t\t\tfor (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tmodelFilename = defaultModelBaseFilename + i + \".\" + defaultModelFilenameExtension;";
  protected final String TEXT_149 = NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tnewFileCreationPage.setFileName(modelFilename);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_150 = NL + "\t\tinitialObjectCreationPage = new ";
  protected final String TEXT_151 = "InitialObjectCreationPage(\"Whatever2\");";
  protected final String TEXT_152 = NL + "\t\tinitialObjectCreationPage.setTitle(";
  protected final String TEXT_153 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_154 = "_label\"));";
  protected final String TEXT_155 = NL + "\t\tinitialObjectCreationPage.setDescription(";
  protected final String TEXT_156 = ".INSTANCE.getString(\"_UI_Wizard_initial_object_description\"));";
  protected final String TEXT_157 = NL + "\t\taddPage(initialObjectCreationPage);" + NL + "\t}" + NL;
  protected final String TEXT_158 = NL + "\t\t/**" + NL + "\t\t * Get the URI from the page." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t*/" + NL + "\t\tpublic URI getModelURI()" + NL + "\t\t{" + NL + "\t\t\treturn initialObjectCreationPage.getFileURI();" + NL + "\t\t}";
  protected final String TEXT_159 = NL + "\t/**" + NL + "\t * Get the file from the page." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic IFile getModelFile()" + NL + "\t{" + NL + "\t\treturn newFileCreationPage.getModelFile();" + NL + "\t}";
  protected final String TEXT_160 = NL + "}";
  protected final String TEXT_161 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genPackage.getPresentationPackageName());
    stringBuffer.append(TEXT_5);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getQualifiedFactoryInterfaceName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_11);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_13);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genPackage.getUncapPackageInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genPackage.getPackageInterfaceName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genPackage.getUncapFactoryInterfaceName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getUncapPackageInterfaceName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genPackage.getFactoryInterfaceName());
    stringBuffer.append(TEXT_25);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_27);
    }
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_34);
    if (!genPackage.hasDocumentRoot()) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genPackage.getUncapPackageInterfaceName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genPackage.getUncapFactoryInterfaceName());
    stringBuffer.append(TEXT_37);
    } else {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData"));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genPackage.getUncapPackageInterfaceName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genPackage.getUncapFactoryInterfaceName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genModel.getImportedName("java.io.File"));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("org.eclipse.jface.operation.IRunnableWithProgress"));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genModel.getImportedName("org.eclipse.jface.operation.IRunnableWithProgress"));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_52);
    } else {
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_54);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_57);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genModel.getImportedName(genModel.getQualifiedEditorAdvisorClassName()));
    stringBuffer.append(TEXT_59);
    } else {
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ui.IWorkbenchWindow"));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ui.IWorkbenchPage"));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ui.IWorkbenchPart"));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.ISelection"));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genModel.getImportedName("org.eclipse.jface.viewers.StructuredSelection"));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ui.PartInitException"));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_70);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genPackage.getPrefix().toLowerCase());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genModel.getImportedName("org.eclipse.core.runtime.Path"));
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_80);
    }
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_82);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genModel.getImportedName("org.eclipse.swt.widgets.Text"));
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_86);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genModel.getImportedName("org.eclipse.swt.widgets.Text"));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genModel.getImportedName("org.eclipse.swt.events.ModifyListener"));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genModel.getImportedName("org.eclipse.swt.events.ModifyEvent"));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("org.eclipse.swt.widgets.Button"));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genModel.getImportedName("org.eclipse.swt.widgets.Button"));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append("_UI_"+genPackage.getEditorClassName()+"FilenameExtension");
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genModel.getImportedName(genModel.getQualifiedEditorAdvisorClassName()));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genModel.getImportedName("org.eclipse.swt.SWT"));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_104);
    }
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_107);
    if (!genPackage.hasDocumentRoot()) {
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genPackage.getUncapPackageInterfaceName());
    stringBuffer.append(TEXT_109);
    } else {
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData"));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData"));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genPackage.getUncapPackageInterfaceName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_115);
    }
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_120);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_121);
    } else {
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_125);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_126);
    }
    stringBuffer.append(TEXT_127);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genPackage.getModelWizardClassName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_157);
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_158);
    } else {
    stringBuffer.append(TEXT_159);
    }
    stringBuffer.append(TEXT_160);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_161);
    return stringBuffer.toString();
  }
}
