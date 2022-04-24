## Appian Data Types

Appian data types can be one of the system types or a custom data type.

### Any Type

The **Any Type** is a generic data type and can store any type of data in it.

### Primitive System Data Type

#### Boolean

* Values include true and false.
* 1 is accepted as a literal value meaning yes.
* 0 is accepted as a literal value meaning no.
* The default value is null, which appears as `[Empty Value]` in a process variable.
* You can populate the value using results from the `true()` or `false()` functions.
* The `toboolean()` function can be used to convert true and false or 0 and 1 values into a Boolean data type.

#### Date

* It is used to hold a date value
* Date can be created using the date (year, month, date) function. Default value is empty.
* *Example*: `date(2020, 06, 29) O/P : 6/29/2020`

#### Data and Time

* It is used to hold date and time values
* Date can be created using the data and time (year, month, date, hour, minute, second).
* A data and time value is saved in Greenwich Mean Time (GMT) then converted to the end-user's time zone when displayed.
* *Example*: `datetime(2020, 06, 29) O/P : 6/29/2020 12:00 AM GTM+00:00`

#### Encrypted Text

* This data type is used to store an **Encrypted Text** value.
* An Encrypted Text value can be created in one of the following ways:
  * Entered by a user in a EncryptedTextField component.
  * Generated in a plug-in using the EncryptionService public Java API.

#### Number (Decimal)

* Holds numeric data stored as double precision floating-point decimal numbers. The default value is 0.0.
* Decimal numbers can be created from text strings using the `todecimal()` function.

#### Number (Integer)

* Integer numbers can range from -2,147,483,647 to 2,147,483,647 (or from -2<sup>31+1</sup> to 2<sup>31–1</sup> in scientific notation).
* The default value is 0 and the null value is -2<sup>31</sup>.
* Integer numbers can be created from text strings using the `tointeger()` function.

#### Text

* This type is used to store any UTF-8 text string. Numerical values can be entered into the text data type; however, data manipulation cannot be performed on the text data type (except for report aggregations).
* The default value is `[Empty Value]`.

#### Time

* Time data can be created using the time (hour, minute, second) function.
* *Example*: `time(10,25,10) O/P : 10:25 AM`

### Complex System Data Types

**Complex system data types** are made available in the system to support smart services. These types cannot be edited or deleted. Two examples of complex system data types include DataSubset and ApplicationTestResult.

### Appian Object Data Types

An **Appian object data type** is a required format for objects specific to the Appian system. Similar to primitive and complex system data types, each can be used to store either a single value or a list of values. Appian object data types are only recognizable within the Appian system. Some examples of Appian object data types include *all* Appian objects like interfaces, process models, Application, and Data Store Entities.

### Custom Data Types (CDTs)	

Users can create or import their own custom data types (CDTs). CDT allows users to organize data into a structure and represents logical grouping of related data. Examples of CDTs include Employee, Address, etc.

CDTs can be used:
* To read data from database.
* Write to a database's tables.
* To store information within a process.
* To define inputs or outputs of a web service or Appian plug-in.

#### How to create CDTs

1. Create from scratch.
2. Duplicate existing data types.
3. Create from database table or view.
4. Import XSD file.

#### How to Edit CDTs

1. Download the XSD and Update/Add column. Go to Designed and export the XSD. Save and publish the data store.
2. Update table first and then download XSD update/Add column. Data store will publish automatically.

#### How to Delete CDTs

1. Select the CDT you want to delete and click on delete button.

#### Create New Version from XSD

If you want to modify anything in the CDT and need to update to the same CDT then...
1. To download the XSD file for a data type, click Download XSD in the settings menu of the data type designer.
2. Once you have made the necessary changes to the file, click Create New Version from XSD in the settings menu and upload the new version of the XSD.

#### CDTs Best Practices

It is always a best practice to have different tables for different type of data instead of a single table for all data. You can use multiple CDTs for different types of data so the performance will be better. As an Appian best practice, it will be fine if you use one level of nested CDTs wherever it is required.

### Data Stores

Data stores allow you to insert, update, query, and delete data in the format needed by your applications without writing structured queries (SQL). You must have a business data source configured to use this feature. Custom data types are used to stored data in database.

To create a data store, complete the following:
1. Open an application in Appian Designer and use the New menu to select Data Store.
2. Select a Data Source from the available list. See also: Configuring Relational Databases
3. Click Create & Edit to see the newly created data store in new browser window.
4. Enter a name for the new entity.
5. Select a data type for the entity by clicking Browse and selecting a custom data type from the displayed list.
6. Click Verify to validate that the necessary data structures have been created in the database, and that the database is available.
7. Click Save and Publish.
			
#### Running DDL Scripts

1. After selecting Create tables manually, click Download DDL Script.
2. Review the script or have it reviewed by your DBA to ensure that it meets your organization's requirements.
3. If the script does not meet your requirements, you can modify your custom data type to better suit your needs
4. If the script meets your organization's requirements, run the DDL script to create the necessary tables for your data store entity.
5. Click Verify Again.

### Folders

There are three types of folders:
1. **Document folder**: All the documents need to be stored in document type folder.
2. **Process model folder**: All the process models need to be stored in process model type folder.
3. **Rule folder**: Constants, Expression rules, interfaces, Connected Systems, Integration objects, Decisions, etc. can be stored in rule type folder.

*Note*: Data type, Data store, Record type, Site, Decision, Group, and Feed type objects are not required to be saved in a folder.

## SAIL (Self-Assembling Interface Layer)	

SAIL is Appian's patented language to build user interfaces. SAIL is server-side coding language. As SAIL is server-side coding and as it does not depend on any client-side coding (e.g., Javascript or CSS) it works on any browser and is also default compatible to mobile applications.

SAIL has the following component categories:
1. SAIL Layout
   * Form layout: This is for reserving the space for a form, mostly used when we actually want to submit something. Examples may include Add Employee Details or Submit Visa Application.
2. SAIL inputs
   * textField
   * dateField
   * paragraphField
   * dropdownField
   * checkboxField
3. Selection: Radio button, checkbox, select a row in grid.
4. Display: Rich text field for displaying images and icons.
5. Image type
6. Action: Button, links, etc.
7. Link
8. Grid
9. Charts
10. Picker: Auto complete.
11. Browser
12. Hierarchy Browser Elements

### SAIL Code Execution

1. When we test the interface, code starts executing from top to bottom, it executes each and every line except the saveInto line of every component.
2. The saveInto line will be executed only if we interact with the field (component). 
3. When we interact with any field, saveInto of that field well be executed first.
4. After that code will start execution from top to bottom, and it will skip the save into lines.

SAIL field common parameters include `label`, `value`, and `saveInto`.

### Local Variables

When a variable is defined in an expression instead of made available to the expression by the framework, it is called a local variable.

There are two functions available to define local variables in expressions:
1. **load()**: The load() function allows you to define one or more local variables. The load() function only sets its local variables to their configured values when it is first rendered, often when the user first navigates to the interface or refreshes the browser window.
2. **with()**: The with() function also creates local variables,We know load() sets its variables only when the interface first loads, with() sets its variables every time the expression is reevaluated. *Note*: The value of with() variables cannot be updated in component saveInto inputs because their value is overwritten whenever the expression reevaluates.

```
load(
	local!loadVariable: rand(),
    local!typedText,
    with(
    	local!withVariable: rand(),
    	{
    		a!textField(label: "load() Variable", readOnly: true, value: local!loadVariable),
        	a!textField(label: "with() Variable", readOnly: true, value: local!withVariable),
        	a!textField(label: "Try typing here", value: local!typedText, saveInto: local!typedText),
        	a!buttonLayout(
        		secondaryButtons: {
            		a!buttonWidget(
            			label: "Increment load() variable",
                		value: local!loadVariable+1,
                		saveInto: local!loadVariable
            		)
            	}
        	)
    	}
	)
)
```

#### Arrays and Custom Data Types

In addition to saving to a variable, you can save into an array at a specific index using square brackets. For example: `saveInto: local!names[10]` or `local!names[local!index]`.

## For Study Tonight

* [Billboard Layout](./3%20Wednesday%20Home%20Study.md#billboard-layout)
* [Form Layout](./3%20Wednesday%20Home%20Study.md#form-layout)
* [Section Layout](./3%20Wednesday%20Home%20Study.md#section-layout-component)
* [Box Layout](./3%20Wednesday%20Home%20Study.md#box-layout)
* [Columns Layout](./3%20Wednesday%20Home%20Study.md#columns-layout)
* [Side By Side Layout](./3%20Wednesday%20Home%20Study.md#side-by-side-layout)