SRCBRANCH = "lf-5.15.5_1.0.0"
SRCREV = "114b4fad14869598d364086d64c205372bd6df17" 
IMX_JAILHOUSE_SRC ?= "git://source.codeaurora.org/external/imx/imx-jailhouse.git;protocol=ssh"
SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
           file://0001-tools-scripts-update-shebang-to-python3.patch \
"

do_compile() {
    unset LDFLAGS
    oe_runmake V=1 CC="${CC}" \
        ARCH=${JH_ARCH} CROSS_COMPILE=${TARGET_PREFIX} \
        KDIR=${STAGING_KERNEL_BUILDDIR}
}

do_install:append() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/pyjailhouse
    install -m 0644 ${S}/pyjailhouse/*.py ${D}${PYTHON_SITEPACKAGES_DIR}/pyjailhouse
}

FILES:${PN} += "${nonarch_base_libdir}/firmware"

RDEPENDS:${PN} += " \
    pyjailhouse \
"

COMPATIBLE_MACHINE = "(mx8m|mx8ulp)"
