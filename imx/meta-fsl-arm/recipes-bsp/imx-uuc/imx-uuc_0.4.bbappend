SRC_URI = "${FSL_MIRROR}/imx-uuc-3.10.17-1.0.0.tar.gz \
           file://COPYING-Add-license-file.patch \
           file://sdimage.c-uu.c-update-license-header.patch \
           file://Makefile-adapt-to-work-out-of-box-with-OE-Core.patch"

S = "${WORKDIR}/${PN}-3.10.17-1.0.0"

SRC_URI[md5sum] = "c111a44b436a5715babef897fc13ca2d"
SRC_URI[sha256sum] = "7f398aa3e735ad7176986c1c8cb08a8d9bd4d9c989b2e129ae8c9fd718f9b669"
