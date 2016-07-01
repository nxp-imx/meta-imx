FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-Add-option-to-build-without-xcomposite.patch"

PACKAGECONFIG ??= "xcomposite"
PACKAGECONFIG[xcomposite] = ""

EXTRA_QMAKEVARS_PRE += "${@bb.utils.contains('PACKAGECONFIG', 'xcomposite', '', 'CONFIG+=no-xcomposite', d)}"

PACKAGECONFIG_remove_mx6 = "xcomposite"
PACKAGECONFIG_remove_mx6ul = "xcomposite"
PACKAGECONFIG_remove_mx7 = "xcomposite"
PACKAGECONFIG_remove_mx8 = "xcomposite"
