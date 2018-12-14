SUMMARY = "Opencv : The Open Computer Vision Library"
HOMEPAGE = "http://opencv.org/"
SECTION = "libs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62d89c5dcb0583609ea919c56be0ee76"

ARM_INSTRUCTION_SET_armv4 = "arm"
ARM_INSTRUCTION_SET_armv5 = "arm"

DEPENDS = "libtool swig-native bzip2 zlib glib-2.0 libwebp"

SRCREV_opencv = "a6387c3012d5331798ffca2acdd8297f417101e4"
SRCREV_contrib = "6ef1983f0876fdf65083666d8e73abfecaf9d4f4"
SRCREV_ipp = "bdb7bb85f34a8cb0d35e40a81f58da431aa1557a"
SRCREV_boostdesc = "34e4206aef44d50e6bbcd0ab06354b52e7466d26"
SRCREV_vgg = "fccf7cd6a4b12079f73bbfb21745f9babcd4eb1d"
SRCREV_extra = "3950c64b3df4d9e0ffd39beef2dae21a913a0f35"
SRC_URI[tinydnn.md5sum] = "adb1c512e09ca2c7a6faef36f9c53e59"
SRC_URI[tinydnn.sha256sum] = "e2c61ce8c5debaa644121179e9dbdcf83f497f39de853f8dd5175846505aa18b"

def ipp_filename(d):
    import re
    arch = d.getVar('TARGET_ARCH', True)
    if re.match("i.86$", arch):
        return "ippicv_2017u3_lnx_ia32_general_20180518.tgz"
    else:
        return "ippicv_2017u3_lnx_intel64_general_20180518.tgz"

def ipp_md5sum(d):
    import re
    arch = d.getVar('TARGET_ARCH', True)
    if re.match("i.86$", arch):
        return "ea72de74dae3c604eb6348395366e78e"
    else:
        return "b7cc351267db2d34b9efa1cd22ff0572"

IPP_FILENAME = "${@ipp_filename(d)}"
IPP_MD5 = "${@ipp_md5sum(d)}"

SRCREV_FORMAT = "opencv_contrib_ipp_boostdesc_vgg_extra"
SRC_URI = "git://github.com/opencv/opencv.git;name=opencv \
    git://github.com/opencv/opencv_contrib.git;destsuffix=contrib;name=contrib \
    git://github.com/opencv/opencv_3rdparty.git;branch=ippicv/master_20180518;destsuffix=ipp;name=ipp \
    git://github.com/opencv/opencv_3rdparty.git;branch=contrib_xfeatures2d_boostdesc_20161012;destsuffix=boostdesc;name=boostdesc \
    git://github.com/opencv/opencv_3rdparty.git;branch=contrib_xfeatures2d_vgg_20160317;destsuffix=vgg;name=vgg \
    git://github.com/opencv/opencv_extra.git;destsuffix=extra;name=extra \
    https://github.com/tiny-dnn/tiny-dnn/archive/v1.0.0a3.tar.gz;destsuffix=git/3rdparty/tinydnn/tiny-dnn-1.0.0a3;name=tinydnn;unpack=false \
    file://0001-3rdparty-ippicv-Use-pre-downloaded-ipp.patch \
    file://uselocalxfeatures.patch;patchdir=../contrib/ \
    file://0003-To-fix-errors-as-following.patch \
    file://fixpkgconfig.patch \
    file://0001-Temporarliy-work-around-deprecated-ffmpeg-RAW-functi.patch \
    file://0001-Dont-use-isystem.patch \
    file://fix_openvx_samples.patch \
"
PV = "4.0.0+git${SRCPV}"

S = "${WORKDIR}/git"

do_unpack_extra() {
    mkdir -p ${S}/3rdparty/tinydnn/
    tar xzf ${WORKDIR}/v1.0.0a3.tar.gz -C ${S}/3rdparty/tinydnn/
    tar xzf ${WORKDIR}/ipp/ippicv/${IPP_FILENAME} -C ${WORKDIR}
    cp ${WORKDIR}/vgg/*.i ${WORKDIR}/contrib/modules/xfeatures2d/src
    cp ${WORKDIR}/boostdesc/*.i ${WORKDIR}/contrib/modules/xfeatures2d/src
}
addtask unpack_extra after do_unpack before do_patch

EXTRA_OECMAKE = "-DOPENCV_EXTRA_MODULES_PATH=${WORKDIR}/contrib/modules \
    -DWITH_1394=OFF \
    -DENABLE_PRECOMPILED_HEADERS=OFF \
    -DCMAKE_SKIP_RPATH=ON \
    -DOPENCV_ICV_HASH=${IPP_MD5} \
    -DIPPROOT=${WORKDIR}/ippicv_lnx \
    ${@bb.utils.contains("TARGET_CC_ARCH", "-msse3", "-DENABLE_SSE=1 -DENABLE_SSE2=1 -DENABLE_SSE3=1 -DENABLE_SSSE3=1", "", d)} \
    ${@bb.utils.contains("TARGET_CC_ARCH", "-msse4.1", "-DENABLE_SSE=1 -DENABLE_SSE2=1 -DENABLE_SSE3=1 -DENABLE_SSSE3=1 -DENABLE_SSE41=1", "", d)} \
    ${@bb.utils.contains("TARGET_CC_ARCH", "-msse4.2", "-DENABLE_SSE=1 -DENABLE_SSE2=1 -DENABLE_SSE3=1 -DENABLE_SSSE3=1 -DENABLE_SSE41=1 -DENABLE_SSE42=1", "", d)} \
"
EXTRA_OECMAKE_append_x86 = " -DX86=ON"

PACKAGECONFIG_GTK ?= " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'gtk', '', d)} \
"
PACKAGECONFIG_GTK_mx8 ?= " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland x11',    '', \
       bb.utils.contains('DISTRO_FEATURES',         'x11', 'gtk', \
                                                              '', d), d)} \
"
PACKAGECONFIG ??= "python3 jpeg png tiff v4l libv4l gstreamer samples tbb gphoto2 \
    ${PACKAGECONFIG_GTK} \
    ${@bb.utils.contains("LICENSE_FLAGS_WHITELIST", "commercial", "libav", "", d)}"
PACKAGECONFIG_append_mx8   = " opencl dnn text"
PACKAGECONFIG_append_mx8dv = " openvx"
PACKAGECONFIG_append_mx8qm = " openvx"

PACKAGECONFIG[amdblas] = "-DWITH_OPENCLAMDBLAS=ON,-DWITH_OPENCLAMDBLAS=OFF,libclamdblas,"
PACKAGECONFIG[amdfft] = "-DWITH_OPENCLAMDFFT=ON,-DWITH_OPENCLAMDFFT=OFF,libclamdfft,"
PACKAGECONFIG[dnn] = "-DBUILD_opencv_dnn=ON -DPROTOBUF_UPDATE_FILES=ON -DBUILD_PROTOBUF=OFF,-DBUILD_opencv_dnn=OFF,protobuf protobuf-native,"
PACKAGECONFIG[eigen] = "-DWITH_EIGEN=ON,-DWITH_EIGEN=OFF,libeigen gflags glog,"
PACKAGECONFIG[freetype] = "-DBUILD_opencv_freetype=ON,-DBUILD_opencv_freetype=OFF,freetype,"
PACKAGECONFIG[gphoto2] = "-DWITH_GPHOTO2=ON,-DWITH_GPHOTO2=OFF,libgphoto2,"
PACKAGECONFIG[gstreamer] = "-DWITH_GSTREAMER=ON,-DWITH_GSTREAMER=OFF,gstreamer1.0 gstreamer1.0-plugins-base,"
PACKAGECONFIG[gtk] = "-DWITH_GTK=ON,-DWITH_GTK=OFF,gtk+3,"
PACKAGECONFIG[jasper] = "-DWITH_JASPER=ON,-DWITH_JASPER=OFF,jasper,"
PACKAGECONFIG[java] = "-DJAVA_INCLUDE_PATH=${JAVA_HOME}/include -DJAVA_INCLUDE_PATH2=${JAVA_HOME}/include/linux -DJAVA_AWT_INCLUDE_PATH=${JAVA_HOME}/include -DJAVA_AWT_LIBRARY=${JAVA_HOME}/lib/amd64/libjawt.so -DJAVA_JVM_LIBRARY=${JAVA_HOME}/lib/amd64/server/libjvm.so,,ant-native fastjar-native openjdk-8-native,"
PACKAGECONFIG[jpeg] = "-DWITH_JPEG=ON,-DWITH_JPEG=OFF,jpeg,"
PACKAGECONFIG[libav] = "-DWITH_FFMPEG=ON,-DWITH_FFMPEG=OFF,libav,"
PACKAGECONFIG[libv4l] = "-DWITH_LIBV4L=ON,-DWITH_LIBV4L=OFF,v4l-utils,"
PACKAGECONFIG[opencl] = "-DWITH_OPENCL=ON,-DWITH_OPENCL=OFF,opencl-headers virtual/opencl-icd,"
PACKAGECONFIG[openvx] = "-DWITH_OPENVX=ON -DOPENVX_ROOT=${STAGING_LIBDIR} -DOPENVX_LIB_CANDIDATES='OpenVX;OpenVXU',-DWITH_OPENVX=OFF,virtual/libopenvx,"
PACKAGECONFIG[oracle-java] = "-DJAVA_INCLUDE_PATH=${ORACLE_JAVA_HOME}/include -DJAVA_INCLUDE_PATH2=${ORACLE_JAVA_HOME}/include/linux -DJAVA_AWT_INCLUDE_PATH=${ORACLE_JAVA_HOME}/include -DJAVA_AWT_LIBRARY=${ORACLE_JAVA_HOME}/lib/amd64/libjawt.so -DJAVA_JVM_LIBRARY=${ORACLE_JAVA_HOME}/lib/amd64/server/libjvm.so,,ant-native oracle-jse-jdk oracle-jse-jdk-native,"
PACKAGECONFIG[png] = "-DWITH_PNG=ON,-DWITH_PNG=OFF,libpng,"
PACKAGECONFIG[python2] = "-DPYTHON2_NUMPY_INCLUDE_DIRS:PATH=${STAGING_LIBDIR}/${PYTHON_DIR}/site-packages/numpy/core/include,,python-numpy,"
PACKAGECONFIG[python3] = "-DPYTHON3_NUMPY_INCLUDE_DIRS:PATH=${STAGING_LIBDIR}/${PYTHON_DIR}/site-packages/numpy/core/include,,python3-numpy,"
PACKAGECONFIG[qt5] = "-DWITH_QT=ON -DWITH_GTK=OFF -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_BINDIR_NATIVE}/qt5 -DCMAKE_PREFIX_PATH=${STAGING_BINDIR_NATIVE}/cmake,-DWITH_QT=OFF,qtbase qtbase-native,"
PACKAGECONFIG[samples] = "-DBUILD_EXAMPLES=ON -DINSTALL_PYTHON_EXAMPLES=ON,-DBUILD_EXAMPLES=OFF,,"
PACKAGECONFIG[tbb] = "-DWITH_TBB=ON,-DWITH_TBB=OFF,tbb,"
PACKAGECONFIG[test] = "-DBUILD_TESTS=ON -DINSTALL_TESTS=ON -DOPENCV_TEST_DATA_PATH=${S}/../extra/testdata, -DBUILD_TESTS=OFF -DINSTALL_TESTS=OFF,"
PACKAGECONFIG[text] = "-DBUILD_opencv_text=ON,-DBUILD_opencv_text=OFF,tesseract,"
PACKAGECONFIG[tiff] = "-DWITH_TIFF=ON,-DWITH_TIFF=OFF,tiff,"
PACKAGECONFIG[v4l] = "-DWITH_V4L=ON,-DWITH_V4L=OFF,v4l-utils,"

inherit pkgconfig cmake

inherit ${@bb.utils.contains('PACKAGECONFIG', 'python3', 'distutils3-base', '', d)}
inherit ${@bb.utils.contains('PACKAGECONFIG', 'python2', 'distutils-base', '', d)}

export PYTHON_CSPEC="-I${STAGING_INCDIR}/${PYTHON_DIR}"
export PYTHON="${STAGING_BINDIR_NATIVE}/${@bb.utils.contains('PACKAGECONFIG', 'python3', 'python3', 'python', d)}"
export ORACLE_JAVA_HOME="${STAGING_DIR_NATIVE}/usr/bin/java"
export JAVA_HOME="${STAGING_DIR_NATIVE}/usr/lib/jvm/openjdk-8-native"
export ANT_DIR="${STAGING_DIR_NATIVE}/usr/share/ant/"

TARGET_CC_ARCH += "-I${S}/include "

PACKAGES += "${@bb.utils.contains('PACKAGECONFIG', 'samples', '${PN}-samples', '', d)} \
    ${@bb.utils.contains('PACKAGECONFIG', 'oracle-java', '${PN}-java', '', d)} \
    ${@bb.utils.contains('PACKAGECONFIG', 'java', '${PN}-java', '', d)} \
    ${@bb.utils.contains('PACKAGECONFIG', 'python2', 'python-${BPN}', '', d)} \
    ${@bb.utils.contains('PACKAGECONFIG', 'python3', 'python3-${BPN}', '', d)} \
    ${PN}-apps"

python populate_packages_prepend () {
    cv_libdir = d.expand('${libdir}')
    do_split_packages(d, cv_libdir, '^lib(.*)\.so$', 'lib%s-dev', 'OpenCV %s development package', extra_depends='${PN}-dev', allow_links=True)
    do_split_packages(d, cv_libdir, '^lib(.*)\.la$', 'lib%s-dev', 'OpenCV %s development package', extra_depends='${PN}-dev')
    do_split_packages(d, cv_libdir, '^lib(.*)\.a$', 'lib%s-dev', 'OpenCV %s development package', extra_depends='${PN}-dev')
    do_split_packages(d, cv_libdir, '^lib(.*)\.so\.*', 'lib%s', 'OpenCV %s library', extra_depends='', allow_links=True)

    pn = d.getVar('PN')
    metapkg =  pn + '-dev'
    d.setVar('ALLOW_EMPTY_' + metapkg, "1")
    blacklist = [ metapkg ]
    metapkg_rdepends = [ ]
    packages = d.getVar('PACKAGES').split()
    for pkg in packages[1:]:
        if not pkg in blacklist and not pkg in metapkg_rdepends and pkg.endswith('-dev'):
            metapkg_rdepends.append(pkg)
    d.setVar('RRECOMMENDS_' + metapkg, ' '.join(metapkg_rdepends))

    metapkg =  pn
    d.setVar('ALLOW_EMPTY_' + metapkg, "1")
    blacklist = [ metapkg, "libopencv-ts" ]
    metapkg_rdepends = [ ]
    for pkg in packages[1:]:
        if not pkg in blacklist and not pkg in metapkg_rdepends and not pkg.endswith('-dev') and not pkg.endswith('-dbg') and not pkg.endswith('-doc') and not pkg.endswith('-locale') and not pkg.endswith('-staticdev'):
            metapkg_rdepends.append(pkg)
    d.setVar('RDEPENDS_' + metapkg, ' '.join(metapkg_rdepends))
}

PACKAGES_DYNAMIC += "^libopencv-.*"

FILES_${PN} = "${datadir}/licenses"
FILES_${PN}-dbg += "${datadir}/OpenCV/java/.debug/* ${datadir}/OpenCV/samples/bin/.debug/* ${datadir}/opencv4/valgrind*.supp"
FILES_${PN}-dev = "${includedir} ${libdir}/pkgconfig ${datadir}/OpenCV/*.cmake ${libdir}/cmake"
FILES_${PN}-staticdev += "${datadir}/OpenCV/3rdparty/lib/*.a"
FILES_${PN}-apps = "${bindir}/* ${datadir}/OpenCV"
FILES_${PN}-java = "${datadir}/OpenCV/java"
FILES_${PN}-samples = "${datadir}/OpenCV/samples ${datadir}/opencv4/samples ${datadir}/opencv4/*cascades ${datadir}/opencv4/testdata/"

INSANE_SKIP_${PN}-java = "libdir"
INSANE_SKIP_${PN}-dbg = "libdir"

ALLOW_EMPTY_${PN} = "1"

SUMMARY_python-opencv = "Python bindings to opencv"
FILES_python-opencv = "${PYTHON_SITEPACKAGES_DIR}/*"
RDEPENDS_python-opencv = "python-core python-numpy"

SUMMARY_python3-opencv = "Python bindings to opencv"
FILES_python3-opencv = "${PYTHON_SITEPACKAGES_DIR}/*"
RDEPENDS_python3-opencv = "python3-core python3-numpy"

do_install_append() {
    # Move Python files into correct library folder (for multilib build)
    if [ "$libdir" != "/usr/lib" -a -d ${D}/usr/lib ]; then
        mv ${D}/usr/lib/* ${D}/${libdir}/
        rm -rf ${D}/usr/lib
    fi

    if ${@bb.utils.contains("PACKAGECONFIG", "samples", "true", "false", d)}; then
        install -d ${D}${datadir}/OpenCV/samples/data
        cp -r ${S}/samples/data/* ${D}${datadir}/OpenCV/samples/data

        install -d ${D}${datadir}/OpenCV/samples/bin/
        cp -f bin/example_* ${D}${datadir}/OpenCV/samples/bin/
    fi
}

RDEPENDS_opencv-apps += "${@bb.utils.contains('PACKAGECONFIG', 'test', 'bash', '', d)}"
