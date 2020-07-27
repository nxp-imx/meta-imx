
DEPENDS_remove = "vulkan"
DEPENDS_append = " vulkan-headers vulkan-loader"

SRC_URI_append = " http://vulkan.gpuinfo.org/downloads/vulkan_asset_pack.zip"
SRC_URI[md5sum] = "0124a93da991e126bfd5dc6ed816b95b"
SRC_URI[sha256sum] = "22328f20743573fa692ecd83e092f3752d0f7906c0f573a7bcfce76b52e46158"

# Install newer assests
do_install_append () {
    cp -r ${WORKDIR}/data/* ${D}${datadir}/vulkan-demos
}
