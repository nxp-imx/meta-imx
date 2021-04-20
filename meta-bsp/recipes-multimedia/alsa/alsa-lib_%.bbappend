FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

IMX_PATCH += " \
    file://0001-pcm-plugin-status-fix-the-return-value-regression.patch \
    file://0002-pcm-plugin-status-revert-the-recent-changes.patch \
"

PACKAGE_ARCH_imx = "${TUNE_PKGARCH}"
