SUMMARY = "Optimum integration for Kinara Ara-2"
DESCRIPTION = "Hugging Face Optimum extension for running supported models on the Kinara Ara-2 NPU runtime."
HOMEPAGE = "https://github.com/NXP/Optimum-Ara"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "python3-hatchling-native"

SRC_URI ?= " \
    git://github.com/NXP/Optimum-Ara.git;protocol=https;branch=${SRCBRANCH} \
"
SRCBRANCH = "main"
SRCREV = "4219ec0e1430c53d79d7c992daf859853b9acdf5"
# PV (1.0.1) tracks the upstream Optimum-Ara release line; SRCREV pins the
# matching commit on main. Bump both when moving to a new upstream release.

# Build the wheel directly with hatchling from the native sysroot.
# The repo's build.sh wraps `uv build --wheel`, but uv wants to fetch
# hatchling from pypi.org which the NXP firewall blocks. Bypass uv and
# invoke hatchling straight from python3-hatchling-native.
inherit python3native

do_compile() {
    cd ${S}
    ${PYTHON} -m hatchling build -t wheel -d ./dist
}

do_install() {
    # Wheel → python-wheels/ (consumed by eiq-aaf-connector's install.sh)
    install -d ${D}${datadir}/python-wheels
    install -m 0644 ${S}/dist/optimum_ara-*.whl \
                     ${D}${datadir}/python-wheels/

    # docs/examples/models/README.md → ara2/optimum-ara/. The ara2-* runtime
    # scripts and fetch_models.py read model configs and example manifests
    # from these trees, so the full dirs (not just the wheel) are needed on
    # target. Only docs/assets (heavy architecture diagrams) is pruned below.
    install -d ${D}${datadir}/ara2/optimum-ara
    cp -a --no-preserve=ownership ${S}/docs ${S}/examples ${S}/models ${S}/README.md \
                                  ${D}${datadir}/ara2/optimum-ara/
    # docs/assets ships heavy architecture diagrams; drop to slim the .bin
    rm -rf ${D}${datadir}/ara2/optimum-ara/docs/assets
}

FILES:${PN} = " \
    ${datadir}/python-wheels/*.whl \
    ${datadir}/ara2/optimum-ara \
"

RDEPENDS:${PN} += " \
    imx-nxp-ara2 \
    python3-ctypes \
    python3-json \
    python3-logging \
"
