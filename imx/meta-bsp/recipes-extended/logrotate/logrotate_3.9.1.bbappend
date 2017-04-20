HOMEPAGE = "https://github.com/logrotate/logrotate/issues"

# When updating logrotate to latest upstream, SRC_URI should point to
# a proper release tarball from https://github.com/logrotate/logrotate/releases
# and we have to take the snapshot for now because there is no such
# tarball available for 3.9.1.

S = "${WORKDIR}/${BPN}-r3-9-1"

UPSTREAM_CHECK_URI = "https://github.com/${BPN}/${BPN}/releases"

SRC_URI = "https://github.com/${BPN}/${BPN}/archive/r3-9-1.tar.gz \
           file://act-as-mv-when-rotate.patch \
           file://update-the-manual.patch \
           file://disable-check-different-filesystems.patch \
            "
 
SRC_URI[md5sum] = "8572b7c2cf9ade09a8a8e10098500fb3"
SRC_URI[sha256sum] = "5bf8e478c428e7744fefa465118f8296e7e771c981fb6dffb7527856a0ea3617"
 