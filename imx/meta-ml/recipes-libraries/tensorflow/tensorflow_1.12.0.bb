DESCRIPTION = "TensorFlow C/C++ Libraries"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01e86893010a1b87e69a213faa753ebd"

DEPENDS = "protobuf-native protobuf zlib unzip-native"

SRC_URI = " \
	git://github.com/tensorflow/tensorflow.git \
	file://download.patch \
	file://makefile.patch \
"
SRCREV = "a6d8ffae097d0132989ae4688d224121ec6d8f35"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'CXX=${CXX}' 'CC=${CC}' 'AR=${AR}' \
	'HOST_CXXFLAGS=${BUILD_CXXFLAGS} --std=c++11' 'HOST_LDOPTS=${BUILD_LDFLAGS}' \
	'LDFLAGS=${LDFLAGS}' 'CXXFLAGS=${CXXFLAGS} --std=c++11 -DNDEBUG -DIS_SLIM_BUILD' "

do_configure () {
	
	export HTTP_PROXY=${http_proxy}
	export HTTPS_PROXY=${https_proxy}
	export http_proxy=${http_proxy}
	export https_proxy=${https_proxy}

	${S}/tensorflow/contrib/makefile/download_dependencies.sh
	
	# Create Makefile in repo root so we can use do_compile command 'as-is'
	echo "include tensorflow/contrib/makefile/Makefile" > Makefile
}

do_compile_prepend () {

	# Change CC definition from default to Yocto's CC
	# This step can't be done via patch file, since nsync sources are downloaded during 'configure' phase
	find tensorflow/contrib/makefile/downloads/nsync/builds/${TARGET_ARCH}* -name Makefile | \
		xargs sed -i 's#CC=.*#CC='"${CXX}"'#g'
	find tensorflow/contrib/makefile/downloads/nsync/builds/${TARGET_ARCH}* -name Makefile | \
		xargs sed -i 's#PLATFORM_CPPFLAGS=#PLATFORM_CPPFLAGS=-Wno-class-memaccess #g'

	TARGET_NSYNC_LIB_PATH=`tensorflow/contrib/makefile/compile_nsync.sh -t linux -a ${TARGET_ARCH}`
	export TARGET_NSYNC_LIB=$TARGET_NSYNC_LIB_PATH
	
	HOST_NSYNC_LIB_PATH=`tensorflow/contrib/makefile/compile_nsync.sh`
	export HOST_NSYNC_LIB=$HOST_NSYNC_LIB_PATH
}

do_install () {
	install -d ${D}${libdir}

	install -m 0555 \
		${S}/tensorflow/contrib/makefile/gen/lib/libtensorflow*.a \
		${D}${libdir}

	install -d ${D}${includedir}/tensorflow
	cd ${S}/tensorflow
	# TODO: filter out unnecassary files? workout the headers within dependencies 
	cp --parents \
		$(find . -name "*.h*"  ) \
		${D}${includedir}/tensorflow
	rm -rf \
		${D}${includedir}/tensorflow/core/example

	install -d ${D}${bindir}/${PN}-${PV}/examples
	for app in ${S}/tensorflow/contrib/makefile/gen/bin/*
	do
		install -m 0555 $app ${D}${bindir}/${PN}-${PV}/examples
	done

	ln -sf ${PN}-${PV} ${PN}
}

PACKAGES = "${PN}"

FILES_${PN} = " \
	${libdir} \
	${includedir} \
	${bindir} \
"

RDEPENDS_${PN} += "protobuf"

# TensorFlow and TensorFlow Lite both exports few files, suppres the error
# SSTATE_DUPWHITELIST = "${D}${includedir}"
SSTATE_DUPWHITELIST = "/"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

INSANE_SKIP_${PN} += " \
	already-stripped \
	staticdev \
"
COMPATIBLE_MACHINE = "(mx8)"
