SUMMARY = "SWIG - Simplified Wrapper and Interface Generator"
DESCRIPTION = "SWIG is a compiler that makes it easy to integrate C and C++ \
code with other languages including Perl, Tcl, Ruby, Python, Java, Guile, \
Mzscheme, Chicken, OCaml, Pike, and C#."
HOMEPAGE = "http://www.swig.org/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e7807a6282784a7dde4c846626b08fc6 \
                    file://LICENSE-GPL;md5=d32239bcb673463ab874e80d47fae504 \
                    file://LICENSE-UNIVERSITIES;md5=8ce9dcc8f7c994de4a408b205c72ba08"

SECTION = "devel"

DEPENDS = "libpcre bison-native"

SRC_URI = "git://github.com/swig/swig.git"
SRCREV = "efe5f181cf69975cf2fa1dcddefc29b93e4a6196"

inherit autotools python3native pkgconfig

EXTRA_OECONF = " \
    --with-python3=${PYTHON} \
    --without-allegrocl \
    --without-android \
    --without-boost \
    --without-chicken \
    --without-clisp \
    --without-csharp \
    --without-d \
    --without-gcj \
    --without-go \
    --without-guile \
    --without-java \
    --without-lua \
    --without-mzscheme \
    --without-ocaml \
    --without-octave \
    --without-perl5 \
    --without-pike \
    --without-php \
    --without-r \
    --without-ruby \
    --without-tcl \
"

S = "${WORKDIR}/git"

EXTRA_AUTORECONF += "-I Tools/config"

BBCLASSEXTEND = "native nativesdk"

# necessary together with bison dependency until a new upstream version after
# 3.0.12 includes 0001-Fix-generated-code-for-constant-expressions-containi.patch
do_configure:append() {
    mkdir -p ${B}/Source/CParse
}

do_install:append:class-nativesdk() {
    cd ${D}${bindir}
    ln -s swig swig4.0
}

def swiglib_relpath(d):
    swiglib = d.getVar('datadir') + "/" + 'swig' + "/" + d.getVar('PV')
    return os.path.relpath(swiglib, d.getVar('bindir'))

do_install:append:class-native() {
    create_wrapper ${D}${bindir}/swig SWIG_LIB='`dirname $''realpath`'/${@swiglib_relpath(d)}
}
