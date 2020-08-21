SUMMARY = "The ARM Computer Vision and Machine Learning library"
DESCRIPTION = "The ARM Computer Vision and Machine Learning library is a set of functions optimised for both ARM CPUs and GPUs."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c2e6902c16b52c68b379cecc3fafad7 \
                    file://include/half/LICENSE.txt;md5=fe7e5a4795c76b317919afd2d3da5983"

PV = "20.02+git${SRCPV}"

ARM_COMPUTELIBRARY_SRC ?= "git://source.codeaurora.org/external/imx/arm-computelibrary-imx.git;protocol=https"
SRCBRANCH = "imx_5.4.47_2.2.0"

SRC_URI = "${ARM_COMPUTELIBRARY_SRC};branch=${SRCBRANCH}"

SRCREV = "3961def57889dc8c29883fe206820b51c7a3169c"

RDEPENDS_${PN} = "bash"

S = "${WORKDIR}/git"

inherit scons

PACKAGECONFIG_OPENCL       = ""
PACKAGECONFIG_OPENCL_mx8   = "opencl embed"
PACKAGECONFIG_OPENCL_mx8mm = ""

PACKAGECONFIG ??= "${PACKAGECONFIG_OPENCL}"

PACKAGECONFIG[benchmark] = "benchmark_tests=1,benchmark_tests=0"
PACKAGECONFIG[validation] = "validation_tests=1,validation_tests=0"
PACKAGECONFIG[opencl] = "opencl=1,opencl=0,opencl-headers virtual/opencl-icd"
PACKAGECONFIG[gles] = "gles_compute=1,gles_compute=0"
PACKAGECONFIG[embed] = "embed_kernels=1,embed_kernels=0"
PACKAGECONFIG[neon] = "neon=1,neon=0"

# Specify any options you want to pass to scons using EXTRA_OESCONS:
EXTRA_OESCONS = "${PARALLEL_MAKE} Werror=0 build=cross_compile os=linux examples=1 ${PACKAGECONFIG_CONFARGS}"
EXTRA_OESCONS += "${@bb.utils.contains('TARGET_ARCH', 'aarch64', 'arch=arm64-v8a neon=1', '', d)}"

do_install() {
	CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"
	install -d ${D}${includedir}
	
	# using cp instead of install - just temporary thing
	cp $CP_ARGS arm_compute ${D}${includedir}
	cp $CP_ARGS support ${D}${includedir}
	cp $CP_ARGS include/half ${D}${includedir}

	install -d ${D}${libdir}
	install -m 0755 build/libarm_compute*.so ${D}${libdir}
	install -m 0755 build/libarm_compute*.a ${D}${libdir}

	install -d ${D}${bindir}
	install -d ${D}${bindir}/examples
	for item in build/examples/*; do
        echo "checking item: $item"
        if [ ${item} != "build/examples/gemm_tuner" ]; then
            [ -x ${item} ] && install -m 0555 ${item} ${D}${bindir}/examples
        else
            [ -x ${item} ] && install -d ${D}${bindir}/examples/gemm_tuner
            for gt_item in build/examples/gemm_tuner/*; do
                [ -x ${gt_item} ] && install -m 0555 ${gt_item} ${D}${bindir}/examples/gemm_tuner
            done
        fi
	done

	if ${@bb.utils.contains("PACKAGECONFIG", "benchmark", "true", "false", d)}; then
		install -m 0555 build/tests/arm_compute_benchmark ${D}${bindir}
	fi

	if ${@bb.utils.contains("PACKAGECONFIG", "validation", "true", "false", d)}; then
		install -m 0555 build/tests/arm_compute_validation ${D}${bindir}
		install -m 0755 build/tests/libarm_compute_validation_framework.a ${D}${libdir}
	fi

	#prepare exports for ARM NN
	install -d ${D}${datadir}/${BPN}
	#documentation folder is causing issues during write_rpm phase
	#cp $CP_ARGS ${S}/. ${D}${datadir}/${BPN}
	rm -rf ${S}/.git
	rm -rf ${S}/documentation
	cp -r ${S}/* ${D}${datadir}/${BPN}
}

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

PACKAGES = "${PN} ${PN}-source"

FILES_${PN} += "${includedir}/* ${libdir}/*"
FILES_${PN}-source = "${datadir}/${BPN}"

# Suppress the QA error
# usage of rsync is causing host-user-contaminated error
INSANE_SKIP_${PN} += "ldflags  libdir staticdev host-user-contaminated"
INSANE_SKIP_${PN}-source += "ldflags  libdir staticdev host-user-contaminated"

# We support i.MX8 only (for now)
COMPATIBLE_MACHINE = "(mx8)"
