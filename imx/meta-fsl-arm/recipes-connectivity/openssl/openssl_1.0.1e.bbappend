
SRC_URI += "file://0001-change_engines_loc.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS = "perl-native-runtime"
DEPENDS += "cryptodev-native"

files_${PN} += "${sysconfdir}/ssl/openssl.cnf"
FILES_${PN}-misc = "${sysconfdir}/ssl/misc ${sysconfdir}/ssl/certs ${sysconfdir}/ssl/private"
files_${PN}-engines = "${libdir}/ssl/engines/*.so"

do_configure () {
        cd util
        perl perlpath.pl ${STAGING_BINDIR_NATIVE}
        cd ..
        ln -sf apps/openssl.pod crypto/crypto.pod ssl/ssl.pod doc/

        os=${HOST_OS}
        if [ "x$os" = "xlinux-uclibc" ]; then
                os=linux
        elif [ "x$os" = "xlinux-uclibceabi" ]; then
                os=linux
        elif [ "x$os" = "xlinux-gnueabi" ]; then
                os=linux
        fi
        target="$os-${HOST_ARCH}"
        case $target in
        linux-arm)
                target=linux-elf-arm
                ;;
        linux-armeb)
                target=linux-elf-armeb
                ;;
        linux-sh3)
                target=debian-sh3
                ;;
        linux-sh4)
                target=debian-sh4
                ;;
        linux-i486)
                target=debian-i386-i486
                ;;
        linux-i586 | linux-viac3)
                target=debian-i386-i586
                ;;
        linux-i686)
                target=debian-i386-i686/cmov
                ;;
        linux-gnux32-x86_64)
                target=linux-x32
                ;;
        linux-gnu64-x86_64)
                target=linux-x86_64
                ;;
        linux-mips)
                target=debian-mips
                ;;
        linux-mipsel)
                target=debian-mipsel
                ;;
        linux-*-mips64)
               target=linux-mips
                ;;
        linux-powerpc)
                target=linux-ppc
                ;;
        linux-gnuspe-powerpc)
                target=linux-ppc
                ;;
        linux-powerpc64)
                target=linux-ppc64
                ;;
        linux-supersparc)
                target=linux-sparcv8
                ;;
        linux-sparc)
                target=linux-sparcv8
                ;;
        darwin-i386)
                target=darwin-i386-cc
                ;;
        esac
        # inject machine-specific flags
        sed -i -e "s|^\(\"$target\",\s*\"[^:]\+\):\([^:]\+\)|\1:${CFLAG}|g" Configure
        useprefix=${prefix}
        if [ "x$useprefix" = "x" ]; then
                useprefix=/
        fi
        perl ./Configure ${EXTRA_OECONF} shared --prefix=$useprefix --openssldir=$sysconfdir/ssl --libdir=`basename ${libdir}` $target

}


do_compile () {
	oe_runmake ZLIB_INCLUDE="-I${STAGING_INCDIR}"
}

do_install () {
        oe_runmake INSTALL_PREFIX="${D}" MANDIR="${mandir}" install

        oe_libinstall -so libcrypto ${D}${libdir}
        oe_libinstall -so libssl ${D}${libdir}

        # Moving libcrypto to /lib
        if [ ! ${D}${libdir} -ef ${D}${base_libdir} ]; then
                mkdir -p ${D}/${base_libdir}/
                mv ${D}${libdir}/libcrypto* ${D}${base_libdir}/
                sed -i s#libdir=\$\{exec_prefix\}\/lib#libdir=${base_libdir}# ${D}/${libdir}/pkgconfig/libcrypto.pc
        fi

        install -d ${D}${includedir}
        cp --dereference -R include/openssl ${D}${includedir}
        sed -i -e '1s,.*,#!${bindir}/env perl,' ${D}${sysconfdir}/ssl/misc/CA.pl

        oe_multilib_header openssl/opensslconf.h
}

