SUMMARY = "Python version of the NXP eRPC infrastructure"
DESCRIPTION = "eRPC (Embedded RPC) is an open source Remote Procedure Call (RPC) system for multichip embedded systems and heterogeneous multicore SoCs"
LICENSE = "Proprietary"
AUTHOR = "Jun Zhu <junzhu@nxp.com>"

RDEPENDS_${PN} = "python-pyserial python-enum34 python-argparse python-importlib python-threading python-shell"

LIC_FILES_CHKSUM = "file://readme.md;md5=d3d754f8e1f07a15e65da588118bf793"

SRC_URI = "git://github.com/EmbeddedRPC/erpc.git;protocol=https;branch=dev_erpc_1.4"

SRCREV = "fbe185661afde11d8d809aac9cbdd7b90ab3ca3d"
S = "${WORKDIR}/git/erpc_python"

PV = "1.4+git${SRCPV}"

inherit setuptools
