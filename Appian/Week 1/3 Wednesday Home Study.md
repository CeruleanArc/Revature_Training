## Billboard Layout

A billboard layout allows you to show content overlaid above a decorative background color, photo, or video. The height of the billboard can be configured, as well as the position of the overlay. Billboards are used to add visual interest and richness to pages. Choose backgrounds that complement, but don't distract from page content.

### Overlay Style

Use the full overlay style to reduce visual clutter when overlay contents cover up most of the background image. Avoid using a bar overlay style for a group of billboards with varying content sizes. This results in inconsistent height and visual clutter.

### Billboard Height

Choose the `"AUTO"` height for a billboard to make the entire background image or video visible. As the billboard width increases, the height will increase accordingly.

Choose one of the fixed height options (`"EXTRA_SHORT"`, `"SHORT"`, `"SHORT_PLUS"`, `"MEDIUM"`, `"MEDIUM_PLUS"`, `"TALL"`, `"TALL_PLUS"`, `"EXTRA_TALL"`, `"AUTO"`) for a consistent billboard height across all screen sizes. Background images and videos will be cropped automatically to fit within the specified height.

### Billboard Spacing

Select the `"STANDARD"` margin below value to create vertical space between billboards and other contents below.

### Ensuring Sufficient Contrast

Legibility of information displayed within a billboard layout depends on the interplay between the content style, overlay style, and background media. For example, if negative-style rich text (red) is displayed in an overlay with style of `"NONE"` (transparent) above a background color of red, then the text would not be readable.

Consider the following guidelines when designing for maximum contrast:
* Try the various overlay styles to see which one creates the best balance between the visibility of the background media and legibility of the overlay contents.
* In general, use the `"LIGHT"` and `"SEMI-LIGHT"` overlay styles with lighter backgrounds and the `"DARK"` and `"SEMI-DARK"` styles for darker images and videos. Use a transparent overlay style of `"NONE"` only when the background color/content is known to provide sufficient contrast with the overlay content.
* It is generally more difficult to guarantee good legibility for content displayed above a busy, high-contrast image or video.
* When the overlay style is `"DARK"` or `"SEMI-DARK"`, standard text color is automatically switched to white. When the overlay style is `"LIGHT"` or `"SEMI-LIGHT"`, standard text color is automatically switched to a dark gray.
* When the overlay style is switched to `"NONE"`, the standard text color changes based on the selected background color. For light background colors, standard text is dark gray. For dark background colors, standard text is switched to white. This is true even when background media is set.

### Performance Considerations

Provide images and videos with appropriate resolution and quality for the display size. But also be aware that users with bandwidth constraints may see an empty billboard background before media loads completely—avoid unnecessarily large downloads.

## Form Layout

### Function

`a!formLayout( label, instructions, contents, buttons, validations, validationGroup, skipAutoFocus, showWhen )`

Displays any arrangement of layouts and components beneath a title and above buttons. Use this as the top-level layout for start and task forms.

### Parameters

* `label` (Text): Optional text to display as the interface's title.
* `instructions` (Text): Optional text displayed below the field's label.
* `contents` (Any Type Array): Components and layouts to display in the form body.
* `buttons` (Button Layout): Buttons to display at the bottom of the form, arranged using `a!buttonLayout()`.
* `validations` (Text or Validation Message): Validation errors displayed above the form buttons. Configured using a text array or an array with a mix of text and Validation Message using `a!validationMessage(message, validateAfter)`.
* `validationGroup` (Text or Validation Message Array): When present, the form is only validated when a button in the same validation group is clicked.
* `skipAutoFocus` (Boolean): Determines whether the first input will receive focus when a form loads. Default is false.
* `showWhen` (Boolean): Determines whether the layout is displayed on the interface. When set to false, the layout is hidden and is not evaluated. Default is true.

### Usage Considerations

#### Using a!formLayout()

* A button layout must be present for a back button to appear for activity-chained tasks.
* Use form validation messages for problems that are not specific to a single component.
* The component cannot be either read-only or disabled.

#### Initial behavior and focusing

* The component is not in an initially collapsed section.
* Focus will automatically be applied on initial load to the first component in a form that is one of the following: checkbox, date, date and time, decimal, dropdown, encrypted text, file upload, integer, multi-dropdown, paragraph, picker components, radio button, or text.

## Section Layout Component

### Function

`a!sectionLayout( label, contents, validations, validationGroup, isCollapsible, isInitiallyCollapsed, showWhen, divider, marginBelow, accessibilityText, labelIcon, iconAltText, labelSize, labelHeadingTag, labelColor, dividerColor, dividerWeight, marginAbove )`

This layout requires Appian for Mobile Devices version 17.2 or later. Displays any arrangement of layouts and components beneath a section title on an interface.

### Parameters

* `label` (Text): Text to display as the section's title.
* `contents` (Any Type): Components and layouts to display in the section body.
* `validations` (List of Variant): Validation errors to display above the section.
* `validationGroup` (Text): When present, this field is only validated when a button in the same validation group is pressed.
* `isCollapsible` (Boolean): Determines if an expand/collapse control appears in the section label. Default is false.
* `isInitiallyCollapsed` (Boolean): Determines if the section is collapsed when the interface first loads. Default is false.
* `showWhen` (Boolean): Determines whether the layout is displayed on the interface. When set to false, the layout is hidden and is not evaluated. Default is true.
* `divider` (Text): Determines where a divider appears within the section. Valid values are `"NONE"` (default), `"ABOVE"`, and `"BELOW"`.
* `marginBelow` (Text): Determines how much space is added below the layout. Valid values are `"NONE`, `"EVEN_LESS"`, `"LESS"`, `"STANDARD"` (default), `"MORE"`, `"EVEN_MORE"`.
* `accessibilityText` (Text): Additional text to be announced by screen readers. Used only for accessibility; produces no visible change.
* `labelIcon` (Text): Icon to display next to the label.
* `iconAltText` (Text): Equivalent alternate text for use by screen readers.
* `labelSize` (Text): Determines the label size. Valid values are `"LARGE_PLUS"`, `"LARGE"`, `"MEDIUM_PLUS"`, `"MEDIUM"` (default), `"SMALL"`, `"EXTRA_SMALL"`.
* `labelHeadingTag` (Text): Determines the heading tag associated with the label for use by screen readers; produces no visible change. Valid values are `"H1"`, `"H2"`, `"H3"`, `"H4"`, `"H5"`, and `"H6". The default is dependent on the chosen label size.
* `labelColor` (Text): Determines the label color. Valid values are any valid hex color (e.g., `"#003399"`) or `"ACCENT"` (default), `"STANDARD"`, `"POSITIVE"`, `"NEGATIVE"`, and `"SECONDARY"`.
* `dividerColor` (Text): Determines the divider line color. Valid values are any valid hex color or `"SECONDARY"` (default), `"STANDARD"`, and `"ACCENT"`.
* `dividerWeight` (Text): Determines the divider line thickness. Valid values are `"THIN"` (default), `"MEDIUM"`, and `"THICK"`.
* `marginAbove` (Text): Determines how much space is added above the layout. Valid values are `"NONE"` (default), `"EVEN_LESS"`, `"LESS"`, `"STANDARD"`, `"MORE"`, and `"EVEN_MORE"`.

### Usage Considerations

#### Validations

* Sections that contain validation messages are not collapsible regardless of the `isCollapsible` parameter's value. For example, if a validation is triggered when the form loads, then that section is expanded even if you have specified `true` for the `isInitiallyCollapsed` parameter.
* If you have nested section layouts, any validations on an inner section will also appear in the outer section.

#### Section Headers

* The `labelHeadingTag` parameter allows you to add a descriptive tag to a section heading so that screen readers can more easily convey page structure to the user.

## Box Layout

### Function

`a!boxLayout( label, contents, style, showWhen, isCollapsible, isInitiallyCollapsed, marginBelow, accessibilityText, padding, shape, marginAbove )`

Displays any arrangement of layouts and components within a box on an interface.

### Parameters

* `label` (Text): Text to display as the box's title.
* `contents` (Any Type): Components and layouts to display within the box.
* `style` (Text): Determines the color of the label and box outline. Valid values are any valid hex color or `"STANDARD"` (default), `"ACCENT"`, `"SUCCESS"`, `"INFO"`, `"WARN"`, and `"ERROR"`.
* `showWhen` (Boolean): Determines whether the layout is displayed on the interface. When set to false, the layout is hidden and is not evaluated. Default is true.
* `isCollapsible` (Boolean): Determines if an expand/collapse control appears in the box header. Default is false.
* `isInitiallyCollapsed` (Boolean): Determines if the box is collapsed when the interface first loads. Default is false.
* `marginBelow` (Text): Determines how much space is added below the layout. Valid values are `"NONE"` (default), `"EVEN_LESS"`, `"LESS"`, `"STANDARD"`, `"MORE"`, and `"EVEN_MORE"`.
* `accessibilityText` (Text): Additional text to be announced by screen readers. Used only for accessibility; produces no visible change.
* `padding` (Text): Determines the space between the box edges and its contents. Valid values are `"NONE"`, `"EVEN_LESS"`, `"LESS"` (default), `"STANDARD"`, `"MORE",` and `"EVEN_MORE"`.
* `shape` (Text): Determines the box shape. Valid values are `"SQUARED"` (default), `"SEMI_ROUNDED"`, and `"ROUNDED"`.
* `marginAbove` (Text): Determines how much space is added above the layout. Valid values are `"NONE"` (default), `"EVEN_LESS"`, `"LESS"`, `"STANDARD"`, `"MORE"`, and `"EVEN_MORE"`.

## Columns Layout

### Function

`a!columnsLayout( columns, alignVertical, showWhen, marginBelow, stackWhen, showDividers, spacing, marginAbove )`

Displays any number of columns alongside each other. On narrow screens and mobile devices, columns are stacked.

### Parameters

* `columns` (Any Type): Columns to display using a [column layout](https://docs.appian.com/suite/help/22.1/Column_Layout.html), `a!columnLayout()`.
* `alignVertical` (Text): Determines vertical alignment of all column content with the layout. Valid values are `"TOP"` (default), `"MIDDLE"`, and `"BOTTOM"`.
* `showWhen` (Boolean): Determines whether the layout is displayed on the interface. When set to false, the layout is hidden and is not evaluated. Default is true.
* `marginBelow` (Text): Determines how much space is added below the layout. Valid values are `"NONE"`, `"EVEN_LESS"`, `"LESS"`, `"STANDARD"` (default), `"MORE"`, and `"EVEN_MORE"`.
* `stackWhen` (List of Text): Determines the window width at which column layouts stack vertically. List all widths where columns should stack. Valid values are `"PHONE"` (default), `"TABLET_PORTRAIT"`, `"TABLET_LANDSCAPE"`, `"DESKTOP"`, `"DESKTOP_WIDE"`, and `"NEVER"`.
* `showDividers` (Boolean): Determines whether dividers appear between the columns. Default is false.
* `spacing` (Text): Determines the space between columns in the layout when they are not stacked. Valid values are `"STANDARD"` (default), `"NONE"`, `"DENSE"`, and `"SPARSE"`.
* `marginAbove` (Text): Determines how much space is added above the layout. Valid values are `"NONE"` (default), `"EVEN_LESS"`, `"LESS"`, `"STANDARD"`, `"MORE"`, and `"EVEN_MORE"`.

### Usage Considerations

#### Stacking on mobile

* On mobile phones, columns are stacked by default.

## Side by Side Layout

### Function

`a!sideBySideLayout( items, alignVertical, showWhen, spacing, marginBelow, stackWhen, marginAbove )`

Displays components alongside each other.

### Parameters

* `items` (Any Type): List of items that are displayed in the layout. Accepts `a!sideBySideItem`.
* `alignVertical` (Text): Determines vertical alignment of all content within the layout. Valid values are `"TOP"` (default), `"MIDDLE"`, and `"BOTTOM"`.
* `showWhen` (Boolean): Determines whether the layout is displayed on the interface. When set to false, the layout is hidden and is not evaluated. Default is true.
* `spacing` (Text): Determines the space between columns in the layout when they are not stacked. Valid values are `"STANDARD"` (default), `"NONE"`, `"DENSE"`, and `"SPARSE"`.
* `marginBelow` (Text): Determines how much space is added below the layout. Valid values are `"NONE"`, `"EVEN_LESS"`, `"LESS"`, `"STANDARD"` (default), `"MORE"`, and `"EVEN_MORE"`.
* `stackWhen` (List of Text): Determines the page width at which side by side items stack vertically. List all widths where items should stack. Valid values are `"PHONE"`, `"TABLET_PORTRAIT"`, `"TABLET_LANDSCAPE"`, `"DESKTOP_NARROW"`, `"DESKTOP"`, `"DESKTOP_WIDE"`, and `"NEVER"` (default).