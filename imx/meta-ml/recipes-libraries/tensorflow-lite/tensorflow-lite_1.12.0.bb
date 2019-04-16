DESCRIPTION = "TensorFlow Lite C++ Library"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01e86893010a1b87e69a213faa753ebd"

DEPENDS = "zlib unzip-native"

SRC_URI = " \
	git://github.com/tensorflow/tensorflow.git;branch=${BRANCH} \
	file://download.patch \
"

SRCREV = "a6d8ffae097d0132989ae4688d224121ec6d8f35"
BRANCH = "r1.12"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'TARGET_ARCH=${TARGET_ARCH}' 'CXX=${CXX}' 'CC=${CC}' 'AR=${AR}' 'CXXFLAGS=${CXXFLAGS}'"

do_configure(){
	
	export HTTP_PROXY=${http_proxy}
	export HTTPS_PROXY=${https_proxy}
	export http_proxy=${http_proxy}
	export https_proxy=${https_proxy}

	${S}/tensorflow/contrib/lite/tools/make/download_dependencies.sh

	# Create Makefile in repo root so we can use do_compile command 'as-is'
	echo "include tensorflow/contrib/lite/tools/make/Makefile" > Makefile
}

do_install(){
	# install libraries
	install -d ${D}${libdir}
	for lib in ${S}/tensorflow/contrib/lite/tools/make/gen/linux_${TARGET_ARCH}/lib/*
	do
		install -m 0555 $lib ${D}${libdir}
	done

	# install header files
	install -d ${D}${includedir}/tensorflow/contrib/lite
	cd ${S}/tensorflow/contrib/lite
	cp --parents \
        $(find . -name "*.h*") \
        ${D}${includedir}/tensorflow/contrib/lite

	# install examples
	install -d ${D}${bindir}/${PN}-${PV}/examples
	for example in ${S}/tensorflow/contrib/lite/tools/make/gen/linux_${TARGET_ARCH}/bin/*
	do
		install -m 0555 $example ${D}${bindir}/${PN}-${PV}/examples
	done
}

PACKAGES = "${PN}"

FILES_${PN} = " \
	${libdir} \
	${includedir} \
	${bindir} \
"

RDEPENDS_${PN} += "flatbuffers"

# TensorFlow and TensorFlow Lite both exports few files, suppres the error
# SSTATE_DUPWHITELIST = "${D}${includedir}"
SSTATE_DUPWHITELIST = "/"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

INSANE_SKIP_${PN} += " \
	already-stripped \
	staticdev \
"

