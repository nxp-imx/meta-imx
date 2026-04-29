SUMMARY = "Connector - OpenAI compatible server for AI Agentic Framework."
DESCRIPTION = "REST-based server for inference on LLMs running on i.MX devices with Kinara NPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8ff2d641cc45adce1b1882be29d1e35"

SRC_URI = "git://github.com/nxp-imx-support/eiq-aaf-connector.git;branch=main;protocol=https"
SRC_URI += "file://install.sh"
SRCREV = "b968fef7eba689aa75ded8e9cca9cf334f9b90ee"

S = "${UNPACKDIR}/${BPN}-${PV}"

PREFERRED_VERSION_python3 = "3.13.%"
PREFERRED_VERSION_python3-native = "3.13.%"

DEPENDS += " \
    git-native \
    python3-native \
    python3-setuptools-native \
    python3-wheel-native \
    python3-build-native \
    python3-pip-native \
"

RDEPENDS:${PN} += " \
    bash \
    python3 \
    python3-setuptools \
"

do_configure() {
    cd ${S}
    git submodule update --init --recursive
}

do_compile() {
    cd ${S}
    ${STAGING_BINDIR_NATIVE}/python3-native/python3 -m build --wheel --no-isolation
}

do_install() {
    install -d ${D}${datadir}/${BPN}
    install -m 0755 ${UNPACKDIR}/install.sh ${D}${datadir}/${BPN}/install.sh

    install -d ${D}${bindir}
    install -m 0755 ${UNPACKDIR}/${BPN}-${PV}/aaf-connector ${D}${bindir}

    # Install the wheel
    install -d ${D}/usr/share/python-wheels
    install -m 0644 ${S}/dist/*.whl ${D}/usr/share/python-wheels

    install -d ${D}/usr/share/eiq/aaf_connector
    install -m 0644 ${UNPACKDIR}/${BPN}-${PV}/config/server_config.json ${D}/usr/share/eiq/aaf_connector
}

FILES_SOLIBSDEV = ""
FILES:${PN} += " \
	${datadir}/${BPN} \
	${bindir} \
	/usr/share/python-wheels \
	/usr/share/eiq/aaf_connector \
"

