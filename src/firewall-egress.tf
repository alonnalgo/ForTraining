resource "google_compute_firewall" "o01-ni-gcp" {
  name = "devsecops-fw-all-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "all"
  }

  direction = "EGRESS"
  priority = "2000"
  destination_ranges = [
    "0.0.0.0/0"]
}
