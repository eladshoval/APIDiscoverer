/**
 */
package core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.APIParameter#getName <em>Name</em>}</li>
 *   <li>{@link core.APIParameter#getLocation <em>Location</em>}</li>
 *   <li>{@link core.APIParameter#getRequired <em>Required</em>}</li>
 *   <li>{@link core.APIParameter#getAllowEmplyValue <em>Allow Emply Value</em>}</li>
 *   <li>{@link core.APIParameter#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link core.APIParameter#getDeclaringContext <em>Declaring Context</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getAPIParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredName requiredLocation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL requiredName='not name.oclIsUndefined()' requiredLocation='not location = ParameterLocation::unspecified'"
 * @generated
 */
public interface APIParameter extends SchemaDeclaringContext, SchemaContext, JSONSchemaSubset, JSONPointer, ArrayContext {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see core.CorePackage#getAPIParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link core.APIParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link core.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see core.ParameterLocation
	 * @see #setLocation(ParameterLocation)
	 * @see core.CorePackage#getAPIParameter_Location()
	 * @model
	 * @generated
	 */
	ParameterLocation getLocation();

	/**
	 * Sets the value of the '{@link core.APIParameter#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see core.ParameterLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ParameterLocation value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see core.CorePackage#getAPIParameter_Required()
	 * @model
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link core.APIParameter#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Emply Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Emply Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Emply Value</em>' attribute.
	 * @see #setAllowEmplyValue(Boolean)
	 * @see core.CorePackage#getAPIParameter_AllowEmplyValue()
	 * @model
	 * @generated
	 */
	Boolean getAllowEmplyValue();

	/**
	 * Sets the value of the '{@link core.APIParameter#getAllowEmplyValue <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Emply Value</em>' attribute.
	 * @see #getAllowEmplyValue()
	 * @generated
	 */
	void setAllowEmplyValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see core.CorePackage#getAPIParameter_ReferenceName()
	 * @model
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link core.APIParameter#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Context</em>' reference.
	 * @see #setDeclaringContext(ParamterDeclaringContext)
	 * @see core.CorePackage#getAPIParameter_DeclaringContext()
	 * @model
	 * @generated
	 */
	ParamterDeclaringContext getDeclaringContext();

	/**
	 * Sets the value of the '{@link core.APIParameter#getDeclaringContext <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Context</em>' reference.
	 * @see #getDeclaringContext()
	 * @generated
	 */
	void setDeclaringContext(ParamterDeclaringContext value);

} // APIParameter