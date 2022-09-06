# Copyright 2019-2021 NXP
SUMMARY = "The ARM Computer Vision and Machine Learning library"
DESCRIPTION = "The ARM Computer Vision and Machine Learning library is a set of functions optimised for both ARM CPUs and GPUs."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9598101cf48c5f479cfda9f3fc6fc566 \
                    file://include/half/LICENSE.txt;md5=fe7e5a4795c76b317919afd2d3da5983"

SRCBRANCH = "lf-5.15.32_2.0.0"
ARM_COMPUTELIBRARY_SRC ?= "git://github.com/nxp-imx/arm-computelibrary-imx.git;protocol=https"
SRC_URI = "${ARM_COMPUTELIBRARY_SRC};branch=${SRCBRANCH}"
SRCREV = "a7a16943ab603e8d5697b872421a91151a57cc7d"

S = "${WORKDIR}/git"

inherit scons

PACKAGECONFIG ?= "cppthreads examples"

PACKAGECONFIG[Werror] = "Werror=1,Werror=0"
PACKAGECONFIG[tests] = "benchmark_tests=1 validation_tests=1,benchmark_tests=0 validation_tests=0"
PACKAGECONFIG[opencl] = "opencl=1,opencl=0,opencl-headers opencl-icd-loader"
PACKAGECONFIG[gles] = "gles_compute=1,gles_compute=0"
PACKAGECONFIG[embed] = "embed_kernels=1,embed_kernels=0"
PACKAGECONFIG[debug] = "debug=1,debug=0"
PACKAGECONFIG[cppthreads] = "cppthreads=1,cppthreads=0"
PACKAGECONFIG[examples] = "examples=1,examples=0"

# Specify any options you want to pass to scons using EXTRA_OESCONS:
EXTRA_OESCONS = "${PARALLEL_MAKE} build=cross_compile os=linux toolchain_prefix=' ' extra_cxx_flags='-fPIC' ${PACKAGECONFIG_CONFARGS}"
EXTRA_OESCONS += "${@bb.utils.contains('TARGET_ARCH', 'aarch64', 'arch=arm64-v8a neon=1', '', d)}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
	CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"
	install -d ${D}${includedir}
	cp $CP_ARGS ${S}/arm_compute ${D}${includedir}
	cp $CP_ARGS support ${D}${includedir}
	cp $CP_ARGS include/half ${D}${includedir}

	# install libraries
	install -d ${D}${libdir}
	install -m 0755 ${S}/build/libarm_compute*.so ${D}${libdir}
	install -m 0755 ${S}/build/libarm_compute*.a ${D}${libdir}

	# install examples
	if ${@bb.utils.contains('PACKAGECONFIG', 'examples', 'true', 'false', d)}; then
        install -d ${D}${bindir}/${PN}-${PV}/examples
        for example in ${S}/build/examples/*; do
            if [ -d "$example" ]; then
                continue
            fi
            case "$example" in
                (*.o|*.a) continue;;
            esac
            install -m 0555 $example ${D}${bindir}/${PN}-${PV}/examples
        done
        if [ -d "${S}/build/examples/gemm_tuner" ]; then
            install -d ${D}${bindir}/${PN}-${PV}/examples/gemm_tuner
            for example in ${S}/build/examples/gemm_tuner/*; do
                if [ -d "$example" ]; then
                    continue
                fi
                case "$example" in
                    (*.o|*.a) continue;;
                esac
                install -m 0555 $example ${D}${bindir}/${PN}-${PV}/examples/gemm_tuner
            done
        fi
	fi

    # install tests
    if ${@bb.utils.contains('PACKAGECONFIG', 'tests', 'true', 'false', d)}; then
        install -d ${D}${bindir}/${PN}-${PV}/tests
        for test in ${S}/build/tests/*; do
            if [ -d "$test" ]; then
                continue
            fi
            case "$test" in
                (*.o|*.a) continue;;
            esac
            install -m 0555 $test ${D}${bindir}/${PN}-${PV}/tests
        done
        if [ -d "${S}/build/tests/gemm_tuner" ]; then
            install -d ${D}${bindir}/${PN}-${PV}/tests/gemm_tuner
            for test in ${S}/build/tests/gemm_tuner/*; do
                if [ -d "$test" ]; then
                    continue
                fi
                case "$test" in
                    (*.o|*.a) continue;;
                esac
                install -m 0555 $test ${D}${bindir}/${PN}-${PV}/tests/gemm_tuner
            done
        fi
    fi
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

RDEPENDS:${PN} = "bash"

# We support i.MX8 only (for now)
COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
