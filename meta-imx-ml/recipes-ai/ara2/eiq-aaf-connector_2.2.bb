SUMMARY = "Connector - OpenAI compatible server for AI Agentic Framework."
DESCRIPTION = "REST-based server for inference on LLMs running on i.MX devices with Kinara NPU"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8ff2d641cc45adce1b1882be29d1e35"

SRC_URI = "${EIQ_AAF_CONNECTOR_SRC};branch=${SRCBRANCH}"
EIQ_AAF_CONNECTOR_SRC ?= "git://github.com/nxp-imx-support/eiq-aaf-connector.git;protocol=https"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "4d95b7b285e000a7ec0fbcb476fe4eda7509bfbc"

inherit python_setuptools_build_meta

do_install() {

    install -d ${D}${bindir}
    install -m 0755 ${S}/aaf-connector ${D}${bindir}

    install -d ${D}${datadir}/python-wheels
    install -m 0644 ${UNPACKDIR}/../dist/*.whl ${D}${datadir}/python-wheels

    install -d ${D}${datadir}/eiq/aaf-connector
    install -m 0755 ${S}/install.sh ${D}${datadir}/eiq/aaf-connector/install.sh
    # optimum-ara wheel version drifts with upstream; normalize the hardcoded
    # name in install.sh to a glob so uv pip install resolves whatever ships.
    sed -i 's|optimum_ara-[0-9][0-9.]*-py3-none-any\.whl|optimum_ara-*.whl|' \
            ${D}${datadir}/eiq/aaf-connector/install.sh
    install -m 0644 ${S}/config/server_config.json ${D}${datadir}/eiq/aaf-connector
}

FILES:${PN} += " \
	${datadir}/python-wheels \
	${datadir}/eiq/aaf-connector \
"

RDEPENDS:${PN} = "bash"
