## Study Assignment for the First 3 Days

* [Appian Objects View](./2%20Tuesday%20Home%20Study.md#objects-view)
* [Appian Foundations](https://academy.appian.com/#/curricula/1b1f8760-8e04-4696-9112-b96fd5842efb)
  * *[Lesson 1 – Appian Essentials](../Appian%20Foundations/Lesson%201%20Appian%20Essentials.md#Lesson-1:-appian-essentials)*
  * *Lesson 2* – Application Architecture: Get Started Designing an App
  * *Lesson 3* – Quick Apps: Build Apps Fast and with No Code
  * *Lesson 4* – Create an Application
  * *Lesson 7* – Interfaces 101: Build Forms and Other Interfaces
* [Appian Developer](https://academy.appian.com/#/curricula/7dc6be23-7518-4285-bfc8-cdbf8d4a4b9d) *(if there is time)*
  * *Lesson 1* – Welcome to the Appian Developer Learning Path
  * *Lesson 2* – Appian Essentials
  * *Lesson 3* – Application Architecture: Get Started Designing an App
  * *Lesson 4* – Create an Application: First Steps

## Project 1: Employee Management Application

An employee management application is developed to maintain the details of employees working in any organization. It maintains the information about the personal and official details of the employees. This project aims to simplify the task of maintaining records of the employees of company.

## SAIL (Self-Assembling Interface Layer)

### What is SAIL?

* Framework for designers/developers to create interfaces quickly and efficiently.
* Alternative to simplified UI design, which was problematic because it was...
  * Incompatible across different devices
  * Difficult to easily create unique interfaces for clients

### Building Forms

#### a!formLayout

The function `a!formLayout()` displays any arrangement of layouts and components beneath a title and above buttons. Use this as the top-level layout for start and task forms. See [documentation](https://docs.appian.com/suite/help/22.1/Form_Layout.html) for more details.

The function accepts the following parameters:
* **label** (Text): Text to display as the form's title.
* **instructions** (Text): Supplemental text about this form.
* **contents** (Any Type): Components and layouts to display in the form body.
* **buttons** (ButtonLayout): Buttons to display at the bottom of the form, arranged using `a!buttonLayout()`. A Button Layout must be present for a back button to appear for activity-chained tasks.
* **validations** (List of Variant): Validation errors to display below the form.
* **validationGroup** (Text): When present, this field is only validated when a button in the same validation group is pressed. See the [documentation](https://docs.appian.com/suite/help/22.1/recipe-use-validation-group-for-buttons-with-multiple-validation-rules.html) for more information about how to use validation groups.
* **skipAutoFocus** (Boolean): Determines whether the first input will receive focus when a form loads. Default is false.
* **showWhen** (Boolean): Determines whether the layout is displayed on the interface. When set to false, the layout is hidden and is not evaluated. Default is true.

#### a!textField

The function `a!textField()` displays and allows entry of a single line of text. See [documentation](https://docs.appian.com/suite/help/22.1/Text_Component.html) for more details.

The function accepts the following parameters:
* **label** (Text): Text to display as the field label.
* **instructions** (Text): Supplemental text about this field.
* **required** (Boolean): Determines if a value is required to submit the form. Default is false.
* **readOnly** (Boolean): Determines if the field should display as not editable. Default is false.
* **disabled** (Boolean): Determines if the field should display as potentially editable but grayed out. Default is false.
* **value** (Text): Text to display in the text field.
* **validations** (List of Text String): Validation errors to display below the field when the value is not null.
* **saveInto** (List of Save): One or more variables that are updated with the text when the user changes it. Use `a!save()` to save a modified or alternative value to a variable.
* **refreshAfter** (Text): Determines when the saveInto expression is evaluated. Valid values are `"UNFOCUS"` (default) and `"KEYPRESS"`.
* **validationGroup** (Text): When present, this field is only validated when a button in the same validation group is pressed. See the [documentation](https://docs.appian.com/suite/help/22.1/recipe-use-validation-group-for-buttons-with-multiple-validation-rules.html) for more information about how to use validation groups.
* **requiredMessage** (Text): Custom message to display when the field's value is required and not provided.
* **align** (Text): Determines alignment of the text value. Appian recommends that this setting only be used inside the Grid Layout component. Valid values are `"LEFT"`, `"CENTER"`, and `"RIGHT"`.
* **labelPosition** (Text): Determines where the label appears. Valid values are `"ABOVE"`, `"ADJACENT"`, `"JUSTIFIED"`, and `"COLLAPSED"`.
* **placeholder** (Text): Text to display in the field when it is empty. Does not show if the field is read only.
* **helpTooltip** (Text): Displays a help icon with the specified text as a tooltip. The help icon does not show when the label position is "COLLAPSED."
* **masked** (Boolean): Determines if the value is obscured from view. Default is false.
* **accessibilityText** (Text): Additional text to be announced by screen readers. Used only for accessibility; produces no visible change.
* **showWhen** (Boolean): Determines whether the component is displayed on the interface. When set to false, the component is hidden and is not evaluated. Default is true.
* **inputPurpose** (Text): Indicates the intent of input for accessibility improvements, like autocomplete, used by browsers, and assistive technologies. Valid values are `"NAME"`, `"EMAIL"`, `"PHONE_NUMBER"`, "STREET_ADDRESS"`, `"POSTAL_CODE"`, `"CREDIT_CARD_NUMBER"`, and `"OFF"`.
* **characterLimit** (Number (Integer)): Determines the maximum number of characters. Depending on the language, some characters may count as more than one.
* **showCharacterCount** (Boolean): Determines if the character count displays on the text field. Only applicable if the character limit is set. Default is true.

#### a!integerField

The function `a!integerField` displays and allows entry of a single integer number. See [documentation](https://docs.appian.com/suite/help/22.1/Integer_Component.html) for more details.

The function accepts the following parameters:
* **label** (Text): Text to display as the field label.
* **instructions** (Text): Supplemental text about this field.
* **required** (Boolean): Determines if a value is required to submit the form. Default is false.
* **readOnly** (Boolean): Determines if the field should display as not editable. Default is false.
* **disabled** (Boolean): Determines if the field should display as potentially editable but grayed out. Default is false.
* **value** (Number (Integer)): Number to display in the field.
* **validations** (List of Text String): Validation errors to display below the field when the value is not null.
* **saveInto** (List of Save): One or more variables that are updated with the integer when the user changes it. Use `a!save()` to save a modified or alternative value to a variable.
* **validationGroup** (Text): When present, this field is only validated when a button in the same validation group is pressed. See the [documentation](https://docs.appian.com/suite/help/22.1/recipe-use-validation-group-for-buttons-with-multiple-validation-rules.html) for more information about how to use validation groups.
* **requiredMessage** (Text): Custom message to display when the field's value is required and not provided.
* **align** (Text): Determines alignment of the number value. Appian recommends that this setting only be used inside the Grid Layout component. Valid values are `"LEFT"`, `"CENTER"`, and `"RIGHT"`.
* **labelPosition** (Text): Determines where the label appears. Valid values are `"ABOVE"`, `"ADJACENT"`, `"JUSTIFIED"`, and `"COLLAPSED"`.
* **refreshAfter** (Text): Determines when the saveInto expression is evaluated. Valid values are `"UNFOCUS"` (default) and `"KEYPRESS"`.
* **placeholder** (Text): Text to display in the field when it is empty. Does not show if the field is read only.
* **helpTooltip** (Text): Displays a help icon with the specified text as a tooltip. The help icon does not show when the label position is "COLLAPSED."
* **masked** (Boolean): Determines if the value is obscured from view. Default is false.
* **accessibilityText** (Text): Additional text to be announced by screen readers. Used only for accessibility; produces no visible change.
* **showWhen** (Boolean): Determines whether the component is displayed on the interface. When set to false, the component is hidden and is not evaluated. Default is true.

#### a!dateField

The function `a!dateField` displays and allows entry of a single date (year, month, day). To display a read-only date using a custom format, use a text component. See [documentation](https://docs.appian.com/suite/help/22.1/Date_Component.html) for more details.

The function accepts the following parameters:
* **label** (Text): Text to display as the field label.
* **instructions** (Text): Supplemental text about this field.
* **required** (Boolean): Determines if a value is required to submit the form. Default is false.
* **readOnly** (Boolean): Determines if the field should display as not editable. Default is false.
* **disabled** (Boolean): Determines if the field should display as potentially editable but grayed out. Default is false.
* **value** (Date): Date to display in the field.
* **validations** (List of Text String): Validation errors to display below the field when the value is not null.
* **saveInto** (List of Save): One or more variables that are updated with the date when the user changes it. Use `a!save()` to save a modified or alternative value to a variable.
* **validationGroup** (Text): When present, this field is only validated when a button in the same validation group is pressed. See the [documentation](https://docs.appian.com/suite/help/22.1/recipe-use-validation-group-for-buttons-with-multiple-validation-rules.html) for more information about how to use validation groups.
* **requiredMessage** (Text): Custom message to display when the field's value is required and not provided.
* **align** (Text): Determines alignment of the text value. Appian recommends that this setting only be used inside the Grid Layout component. Valid values are `"LEFT"`, `"CENTER"`, and `"RIGHT"`.
* **labelPosition** (Text): Determines where the label appears. Valid values are `"ABOVE"`, `"ADJACENT"`, `"JUSTIFIED"`, and `"COLLAPSED"`.
* **helpTooltip** (Text): Displays a help icon with the specified text as a tooltip. The help icon does not show when the label position is "COLLAPSED."
* **accessibilityText** (Text): Additional text to be announced by screen readers. Used only for accessibility; produces no visible change.
* **showWhen** (Boolean): Determines whether the component is displayed on the interface. When set to false, the component is hidden and is not evaluated. Default is true.

#### a!checkboxField

The function `a!checkboxField` displays a limited set of choices from which the user may select none, one, or many items and saves the values of the selected choices. See [documentation](https://docs.appian.com/suite/help/22.1/Checkbox_Component.html) for more details.

The function accepts the following parameters:
* **label** (Text): Text to display as the field label.
* **instructions** (Text): Supplemental text about this field.
* **required** (Boolean): Determines if a value is required to submit the form. Default is false.
* **disabled** (Boolean): Determines if the field should display as potentially editable but grayed out. Default is false.
* **choiceLabels** (List of Text String): Array of options for the user to select.
* **choiceValues** (List of Variant): Array of values associated with the available choices.
* **value** (List of Variant): Values of choices to display as selected.
* **validations** (List of Text String): Validation errors to display below the field when the value is not null.
* **saveInto** (List of Save): One or more variables that are updated with the choice values when the user changes the selections. Use `a!save()` to save a modified or alternative value to a variable.
* **validationGroup** (Text): When present, this field is only validated when a button in the same validation group is pressed. See the [documentation](https://docs.appian.com/suite/help/22.1/recipe-use-validation-group-for-buttons-with-multiple-validation-rules.html) for more information about how to use validation groups.
* **requiredMessage** (Text): Custom message to display when the field's value is required and not provided.
* **align** (Text): Determines alignment of the text value. Appian recommends that this setting only be used inside the Grid Layout component. Valid values are `"LEFT"`, `"CENTER"`, and `"RIGHT"`.
* **labelPosition** (Text): Determines where the label appears. Valid values are `"ABOVE"`, `"ADJACENT"`, `"JUSTIFIED"`, and `"COLLAPSED"`.
* **helpTooltip** (Text): Displays a help icon with the specified text as a tooltip. The help icon does not show when the label position is "COLLAPSED."
* **choiceLayout** (Text): Determines the layout. Valid values are `"STACKED"` (default) and `"COMPACT"`.
* **accessibilityText** (Text): Additional text to be announced by screen readers. Used only for accessibility; produces no visible change.
* **showWhen** (Boolean): Determines whether the component is displayed on the interface. When set to false, the component is hidden and is not evaluated. Default is true.
* **choiceStyle** (Text): Determines how the choices should be displayed on the interface. Valid values are `"STANDARD"` and `"CARDS"`.

#### a!dropdownField

The function `a!dropdownField` displays a list of choices for the user to select one item and saves a value based on the selected choice. See [documentation](https://docs.appian.com/suite/help/22.1/Dropdown_Component.html) for more details.

The function accepts the following parameters:
* **label** (Text): Text to display as the field label.
* **labelPosition** (Text): Determines where the label appears. Valid values are `"ABOVE"` (default), `"ADJACENT"`, `"JUSTIFIED"`, and `"COLLAPSED"`.
* **instructions** (Text): Supplemental text about this field.
* **required** (Boolean): Determines if a value is required to submit the form. Default is false.
* **disabled** (Boolean): Determines if the field should display as potentially editable but grayed out. Default is false.
* **choiceLabels** (List of Text String): Array of options for the user to select.
* **choiceValues** (List of Variant): Array of values associated with the available choices.
* **placeholder** (Text): Text to display when nothing is selected and the value is null.
* **value** (Any Type): Value of the choice to display as selected.
* **validations** (List of Text String): Validation errors to display below the field when the value is not null.
* **saveInto** (List of Save): One or more variables that are updated with the choice value when the user changes the selection. Use `a!save()` to save a modified or alternative value to a variable.
* **validationGroup** (Text): When present, this field is only validated when a button in the same validation group is pressed. See the [documentation](https://docs.appian.com/suite/help/22.1/recipe-use-validation-group-for-buttons-with-multiple-validation-rules.html) for more information about how to use validation groups.
* **requiredMessage** (Text): Custom message to display when the field's value is required and not provided.
* **helpTooltip** (Text): Displays a help icon with the specified text as a tooltip. The help icon does not show when the label position is "COLLAPSED."
* **accessibilityText** (Text): Additional text to be announced by screen readers. Used only for accessibility; produces no visible change.
* **showWhen** (Boolean): Determines whether the component is displayed on the interface. When set to false, the component is hidden and is not evaluated. Default is true.
* **searchDisplay** (Text): Determines when a search box displays above the options. Valid values are `"AUTO"` (default), `"ON"`, and `"OFF"`. When set to "AUTO," the search box displays if there are more than 11 options.

#### a!multipleDropdownField

The function `a!multipleDropdownField` displays a list of choices for the user to select multiple items and saves values based on the selected choices. See [documentation](https://docs.appian.com/suite/help/22.1/Multiple_Dropdown_Component.html) for more details.

The function accepts the following parameters:
* **label** (Text): Text to display as the field label.
* **instructions** (Text): Supplemental text about this field.
* **required** (Boolean): Determines if a value is required to submit the form. Default is false.
* **disabled** (Boolean): Determines if the field should display as potentially editable but grayed out. Default is false.
* **placeholder** (Text): Text to display in the field when it is empty.
* **choiceLabels** (List of Text String): Array of options for the user to select.
* **choiceValues** (List of Variant): Values of choices to display as selected.
* **value** (List of Variant): Values of choices to display as selected.
* **validations** (List of Text String): Validation errors to display below the field when the value is not null.
* **saveInto** (List of Save): One or more variables that are updated with the choice values when the user changes the selections. Use `a!save()` to save a modified or alternative value to a variable.
* **validationGroup** (Text): When present, this field is only validated when a button in the same validation group is pressed. See the [documentation](https://docs.appian.com/suite/help/22.1/recipe-use-validation-group-for-buttons-with-multiple-validation-rules.html) for more information about how to use validation groups.
* **requiredMessage** (Text): Custom message to display when the field's value is required and not provided.
* **labelPosition** (Text): Determines where the label appears. Valid values are `"ABOVE"` (default), `"ADJACENT"`, `"JUSTIFIED"`, and `"COLLAPSED"`.
* **helpTooltip** (Text): Displays a help icon with the specified text as a tooltip. The help icon does not show when the label position is "COLLAPSED."
* **accessibilityText** (Text): Additional text to be announced by screen readers. Used only for accessibility; produces no visible change.
* **showWhen** (Boolean): Determines whether the component is displayed on the interface. When set to false, the component is hidden and is not evaluated. Default is true.
* **searchDisplay** (Text): Determines when a search box displays above the options. Valid values are `"AUTO"` (default), `"ON"`, and `"OFF"`. When set to "AUTO," the search box displays if there are more than 11 options.

### Example: Employee Information Collection Form

```
a!formLayout (
  label: "Employee Info",
  instructions: "This form is used to collect employee information.",
  contents: {
    a!textField (
      label: "First Name",
      instructions: "Enter your first name.",
      required: true,
      value: ri!firstName,
      saveInto: ri!firstName,
    ),
    a!textField (
      label: "Last Name",
      instructions: "Enter your last name.",
      required: true,
      value: ri!lastName,
      saveInto: ri!lastName,
    ),
    a!integerField (
      label: "Age",
      value: ri!age,
      saveInto: ri!age,
    ),
    a!dateField(
      label: "Date of Birth",
      value: ri!dob,
      saveInto: ri!dob,
    ),
    a!checkboxField(
      label: "Office Branch",
      choiceLabels: {"New York", "Texas", "District of Columbia"},
      choiceValues: {"NY", "TX", "DC"},
      value: ri!officeBranch,
      saveInto: ri!officeBranch,
    ),
    a!dropdownField(
      label: "Gender",
      choiceLabels: {"Male", "Female", "Transmale", "Transfemale", "Intersex", "Prefer not to say"},
      choiceValues: {"male", "female", "ftm", "mft", "intersex", "unknown"},
      value: ri!gender,
      saveInto: ri!gender,
      placeholder: "Select a gender",
    ),
    a!multipleDropdownField(
      label: "Languages Known",
      choiceLabels: {"English", "Hindi", "French", "Spanish"},
      choiceValues: {"eng", "hin", "fre", "spa"},
      value: ri!languagesKnown,
      saveInto: ri!languagesKnown,
      placeholder: "Select a language",
    ),
  },
)
```