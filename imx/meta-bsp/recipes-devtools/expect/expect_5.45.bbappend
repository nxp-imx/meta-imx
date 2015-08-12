# Backport the patch from poky master -- 6c3c74fa8b12438569b64ba0c82837ccb80ac2ee

EXTRA_OECONF = "--with-tcl=${STAGING_LIBDIR} \
                 --with-tclinclude=${STAGING_INCDIR}/tcl8.6 \
                 --enable-shared \
                 --enable-threads \
                 --disable-rpath \
                "

FILES_${PN}-dev = "${libdir_native}/expect${PV}/libexpect*.so \
                   ${includedir}/expect.h \
                   ${includedir}/expect_tcl.h \
                   ${includedir}/expect_comm.h \
                   ${includedir}/tcldbg.h \
                   ${includedir}/*.h \
                  "
