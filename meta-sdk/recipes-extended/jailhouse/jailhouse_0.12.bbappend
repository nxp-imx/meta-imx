SRCBRANCH = "imx_v0.12_y"
SRCREV = "ec702e3c06def22896afe0f8616873785c1d1b1d"
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"
SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-tools-scripts-update-shebang-to-python3.patch \
"

do_install_append() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/pyjailhouse
    install -m 0644 ${S}/pyjailhouse/*.py ${D}${PYTHON_SITEPACKAGES_DIR}/pyjailhouse
}

FILES_${PN} += "${nonarch_base_libdir}/firmware"
