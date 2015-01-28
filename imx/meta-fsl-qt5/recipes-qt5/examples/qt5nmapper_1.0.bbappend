FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# This patch is required for QT 5.3
# Change property string from onText to onTextString
SRC_URI_append = " file://change-property-string.patch"

