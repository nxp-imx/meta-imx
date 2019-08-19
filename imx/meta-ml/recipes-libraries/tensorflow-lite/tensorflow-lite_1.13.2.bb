DESCRIPTION = "TensorFlow Lite C++ Library"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01e86893010a1b87e69a213faa753ebd"

DEPENDS = "zlib unzip-native"

TENSORFLOW_LITE_SRC ?= "git://source.codeaurora.org/external/imx/tensorflow-imx.git;protocol=https"
SRCBRANCH = "imx-v1.13.2"
SRC_URI = "${TENSORFLOW_LITE_SRC};branch=${SRCBRANCH} \
           file://download.patch \
"
SRCREV = "2b304c96b3e560cfb10c4301e8dc0ad5bc07ddc0"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'TARGET_ARCH=${TARGET_ARCH}' 'CXX=${CXX}' 'CC=${CC}' 'AR=${AR}' 'CXXFLAGS=${CXXFLAGS}'"

do_configure(){
	
	${S}/tensorflow/lite/tools/make/download_dependencies.sh

	# Create Makefile in repo root so we can use do_compile command 'as-is'
	echo "include tensorflow/lite/tools/make/Makefile" > Makefile
}

do_install(){
	# install libraries
	install -d ${D}${libdir}
	for lib in ${S}/tensorflow/lite/tools/make/gen/linux_${TARGET_ARCH}/lib/*
	do
		install -m 0555 $lib ${D}${libdir}
	done

	# install header files
	install -d ${D}${includedir}/tensorflow/lite
	cd ${S}/tensorflow/lite
	cp --parents \
        $(find . -name "*.h*") \
        ${D}${includedir}/tensorflow/lite

	# install examples
	install -d ${D}${bindir}/${PN}-${PV}/examples
	for example in ${S}/tensorflow/lite/tools/make/gen/linux_${TARGET_ARCH}/bin/*
	do
		install -m 0555 $example ${D}${bindir}/${PN}-${PV}/examples
	done

        #install label_image data
	cp ${S}/tensorflow/lite/examples/label_image/testdata/grace_hopper.bmp ${D}${bindir}/${PN}-${PV}/examples
	cp ${S}/tensorflow/lite/java/ovic/src/testdata/labels.txt ${D}${bindir}/${PN}-${PV}/examples
}

RDEPENDS_${PN} += "flatbuffers libnn-imx"

# TensorFlow and TensorFlow Lite both exports few files, suppres the error
# SSTATE_DUPWHITELIST = "${D}${includedir}"
SSTATE_DUPWHITELIST = "/"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

INSANE_SKIP_${PN} += " \
	already-stripped \
	staticdev \
"
