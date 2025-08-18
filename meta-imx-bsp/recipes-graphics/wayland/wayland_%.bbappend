FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-Revert-util-simplify-wl_fixed_to_double.patch \
    file://0002-Revert-util-simplify-wl_fixed_from_double.patch \
"
