
DEPENDS_remove = "vulkan"
DEPENDS_append = " vulkan-headers vulkan-loader"

SRC_URI_append = " http://vulkan.gpuinfo.org/downloads/vulkan_asset_pack.zip"
SRC_URI[md5sum] = "708407aaedc6b39e8bafcb9b00d488e5"
SRC_URI[sha256sum] = "41c654b33ac7963bc8445446688d81c55d2a258cf23f228dc0de6c59a5dcad38"

# Install newer assests
do_install_append () {
    cp -r ${WORKDIR}/data/* ${D}${datadir}/vulkan-demos
}
