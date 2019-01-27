SUMMARY = "The ARM Computer Vision and Machine Learning library"
DESCRIPTION = "The ARM Computer Vision and Machine Learning library is a set of functions optimised for both ARM CPUs and GPUs."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=762a7ba8d2ddc3b38d88742fbaf0b62d"

COMPATIBLE_MACHINE = "armv7a|aarch64"

PROVIDES += "${PN}-examples"

PV = "18.11+git${SRCPV}"

ARM_COMPUTELIBRARY_SRC ?= "git://source.codeaurora.org/external/imx/arm-computelibrary-imx.git;protocol=https"
SRCBRANCH = "imx_18.11"
SRC_URI = "${ARM_COMPUTELIBRARY_SRC};branch=${SRCBRANCH}"
SRCREV = "64441b79b83e0790008486779054e9da891537f3"

S = "${WORKDIR}/git"

do_compile_prepend() {
    sed -i 's/arm-linux-gnueabihf-/${TARGET_PREFIX}/' SConstruct
    sed -i 's/aarch64-linux-gnu-/${TARGET_PREFIX}/' SConstruct
}

inherit scons

PACKAGECONFIG_OPENCL       = ""
PACKAGECONFIG_OPENCL_mx8   = "opencl"
PACKAGECONFIG_OPENCL_mx8mm = ""

PACKAGECONFIG ??= "${PACKAGECONFIG_OPENCL}"

PACKAGECONFIG[opencl] = "opencl=1,opencl=0,,"

EXTRA_OESCONS = "arch=armv7a extra_cxx_flags="-fPIC -Wno-unused-but-set-variable -Wno-ignored-qualifiers -Wno-noexcept" benchmark_tests=1 validation_tests=0 neon=1 openmp=1 set_soname=1 ${PACKAGECONFIG_CONFARGS}"
EXTRA_OESCONS_aarch64 = "arch=arm64-v8a extra_cxx_flags="-fPIC -Wno-unused-but-set-variable -Wno-ignored-qualifiers -Wno-noexcept" benchmark_tests=1 validation_tests=0 neon=1 openmp=1 set_soname=1 ${PACKAGECONFIG_CONFARGS}"

EXTRA_OESCONS_IMX = "Werror=0 embed_kernels=0 openmp=0"
EXTRA_OESCONS_aarch64 += "${EXTRA_OESCONS_IMX}"

LIBS += "-larmpl_lp64_mp"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
    CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"

    install -d ${D}${libdir}
    for lib in ${S}/build/*.so*
    do
        cp $CP_ARGS $lib ${D}${libdir}
    done

    # Install 'example' and benchmark executables
    install -d ${D}${bindir}
    find ${S}/build/examples/ -maxdepth 1 -type f -executable -exec cp $CP_ARGS {} ${D}${bindir} \;
    cp $CP_ARGS ${S}/build/tests/arm_compute_benchmark ${D}${bindir}

    # Install headers
    install -d ${D}${includedir}/${BPN}
    cp $CP_ARGS ${S}/arm_compute ${D}${includedir}/${BPN}/.
    cp $CP_ARGS ${S}/include ${D}${includedir}/${BPN}/.
    cp $CP_ARGS ${S}/support ${D}${includedir}/${BPN}/.
}

PACKAGES =+ "${PN}-examples"

FILES_${PN}-examples = "${bindir}/*"
