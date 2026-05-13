SUMMARY = "Connector - OpenAI compatible server for AI Agentic Framework."
DESCRIPTION = "REST-based server for inference on LLMs running on i.MX devices with Kinara NPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8ff2d641cc45adce1b1882be29d1e35"

SRC_URI = "${EIQ_AAF_CONNECTOR_SRC};branch=${SRCBRANCH}"
SRC_URI += "file://install.sh"
EIQ_AAF_CONNECTOR_SRC ?= "git://github.com/nxp-imx-support/eiq-aaf-connector.git;protocol=https"
SRCBRANCH = "lf-6.18.20_2.0.0"
SRCREV = "5366c67dfab501cf9dafc47f4652bc9bff6da824"

inherit python_setuptools_build_meta

do_install() {

    install -d ${D}${bindir}
    install -m 0755 ${S}/aaf-connector ${D}${bindir}

    install -d ${D}${datadir}/python-wheels
    install -m 0644 ${UNPACKDIR}/../dist/*.whl ${D}${datadir}/python-wheels

    install -d ${D}${datadir}/eiq/aaf-connector
    install -m 0755 ${UNPACKDIR}/install.sh ${D}${datadir}/eiq/aaf-connector/install.sh
    install -m 0644 ${S}/config/server_config.json ${D}${datadir}/eiq/aaf-connector
}

FILES:${PN} += " \
	${datadir}/python-wheels \
	${datadir}/eiq/aaf-connector \
"

