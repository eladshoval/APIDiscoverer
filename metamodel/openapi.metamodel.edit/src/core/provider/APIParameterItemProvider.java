/**
 */
package core.provider;


import core.APIParameter;
import core.CoreFactory;
import core.CorePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link core.APIParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APIParameterItemProvider extends SchemaDeclaringContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIParameterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSchemaPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addMaximumPropertyDescriptor(object);
			addExclusiveMaximumPropertyDescriptor(object);
			addMinimumPropertyDescriptor(object);
			addExclusiveMinimumPropertyDescriptor(object);
			addMaxLengthPropertyDescriptor(object);
			addMinLengthPropertyDescriptor(object);
			addPatternPropertyDescriptor(object);
			addMaxItemsPropertyDescriptor(object);
			addMinItemsPropertyDescriptor(object);
			addUniqueItemsPropertyDescriptor(object);
			addEnumPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addMultipleOfPropertyDescriptor(object);
			addRefPropertyDescriptor(object);
			addCollectionFormatPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addAllowEmplyValuePropertyDescriptor(object);
			addReferenceNamePropertyDescriptor(object);
			addDeclaringContextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIParameter_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIParameter_name_feature", "_UI_APIParameter_type"),
				 CorePackage.Literals.API_PARAMETER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIParameter_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIParameter_location_feature", "_UI_APIParameter_type"),
				 CorePackage.Literals.API_PARAMETER__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_description_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_maximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_maximum_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__MAXIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclusive Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusiveMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_exclusiveMaximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_exclusiveMaximum_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_minimum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_minimum_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__MINIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclusive Minimum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExclusiveMinimumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_exclusiveMinimum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_exclusiveMinimum_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_maxLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_maxLength_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__MAX_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_minLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_minLength_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__MIN_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_pattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_pattern_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_maxItems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_maxItems_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__MAX_ITEMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_minItems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_minItems_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__MIN_ITEMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniqueItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_uniqueItems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_uniqueItems_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIParameter_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIParameter_required_feature", "_UI_APIParameter_type"),
				 CorePackage.Literals.API_PARAMETER__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_type_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_format_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Emply Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowEmplyValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIParameter_allowEmplyValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIParameter_allowEmplyValue_feature", "_UI_APIParameter_type"),
				 CorePackage.Literals.API_PARAMETER__ALLOW_EMPLY_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArrayContext_collectionFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArrayContext_collectionFormat_feature", "_UI_ArrayContext_type"),
				 CorePackage.Literals.ARRAY_CONTEXT__COLLECTION_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_default_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiple Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultipleOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_multipleOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_multipleOf_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__MULTIPLE_OF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONPointer_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONPointer_ref_feature", "_UI_JSONPointer_type"),
				 CorePackage.Literals.JSON_POINTER__REF,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchemaContext_schema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchemaContext_schema_feature", "_UI_SchemaContext_type"),
				 CorePackage.Literals.SCHEMA_CONTEXT__SCHEMA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONSchemaSubset_enum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONSchemaSubset_enum_feature", "_UI_JSONSchemaSubset_type"),
				 CorePackage.Literals.JSON_SCHEMA_SUBSET__ENUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIParameter_referenceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIParameter_referenceName_feature", "_UI_APIParameter_type"),
				 CorePackage.Literals.API_PARAMETER__REFERENCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declaring Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclaringContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APIParameter_declaringContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APIParameter_declaringContext_feature", "_UI_APIParameter_type"),
				 CorePackage.Literals.API_PARAMETER__DECLARING_CONTEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.ARRAY_CONTEXT__ITEMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns APIParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APIParameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((APIParameter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_APIParameter_type") :
			getString("_UI_APIParameter_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(APIParameter.class)) {
			case CorePackage.API_PARAMETER__TYPE:
			case CorePackage.API_PARAMETER__FORMAT:
			case CorePackage.API_PARAMETER__DESCRIPTION:
			case CorePackage.API_PARAMETER__MAXIMUM:
			case CorePackage.API_PARAMETER__EXCLUSIVE_MAXIMUM:
			case CorePackage.API_PARAMETER__MINIMUM:
			case CorePackage.API_PARAMETER__EXCLUSIVE_MINIMUM:
			case CorePackage.API_PARAMETER__MAX_LENGTH:
			case CorePackage.API_PARAMETER__MIN_LENGTH:
			case CorePackage.API_PARAMETER__PATTERN:
			case CorePackage.API_PARAMETER__MAX_ITEMS:
			case CorePackage.API_PARAMETER__MIN_ITEMS:
			case CorePackage.API_PARAMETER__UNIQUE_ITEMS:
			case CorePackage.API_PARAMETER__ENUM:
			case CorePackage.API_PARAMETER__DEFAULT:
			case CorePackage.API_PARAMETER__MULTIPLE_OF:
			case CorePackage.API_PARAMETER__REF:
			case CorePackage.API_PARAMETER__COLLECTION_FORMAT:
			case CorePackage.API_PARAMETER__NAME:
			case CorePackage.API_PARAMETER__LOCATION:
			case CorePackage.API_PARAMETER__REQUIRED:
			case CorePackage.API_PARAMETER__ALLOW_EMPLY_VALUE:
			case CorePackage.API_PARAMETER__REFERENCE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.API_PARAMETER__ITEMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.ARRAY_CONTEXT__ITEMS,
				 CoreFactory.eINSTANCE.createItemsDefinition()));
	}

}