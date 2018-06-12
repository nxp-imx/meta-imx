SUMMARY = "Python version of the NXP eRPC infrastructure"
DESCRIPTION = "eRPC (Embedded RPC) is an open source Remote Procedure Call (RPC) system for multichip embedded systems and heterogeneous multicore SoCs"
LICENSE = "BSD-3"
AUTHOR = "Jun Zhu <junzhu@nxp.com>"

RDEPENDS_${PN} = "python-pyserial python-enum34 python-argparse python-importlib python-threading python-shell"

LIC_FILES_CHKSUM = "file://readme.md;md5=d3d754f8e1f07a15e65da588118bf793"

SRC_URI = "git://github.com/EmbeddedRPC/erpc.git;protocol=https;branch=develop"

SRCREV = "65fd1ee6146d8974430c3afc0c79af3e3a2d2aa9"
S = "${WORKDIR}/git/erpc_python"

PV = "1.7+git${SRCPV}"

inherit setuptools

do_compile_prepend () {
    export IS_YOCTO="1"
}

do_install_prepend () {
    export IS_YOCTO="1"
}
