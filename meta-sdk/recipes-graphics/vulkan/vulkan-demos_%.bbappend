
DEPENDS_remove = "vulkan"
DEPENDS_append = " vulkan-headers vulkan-loader"

# Install newer assests
do_configure_prepend () {
    cd ${S}
    ./download_assets.py
}
