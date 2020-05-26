FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_PATCH_append = " \
    file://0006-add-conf-for-iMX-XCVR-sound-card.patch \
"
PACKAGE_ARCH_imx = "${TUNE_PKGARCH}"
